(ns leiningen.deploy-uberjar
  (:require [leiningen.uberjar :as uberjar]
            [leiningen.jar :as jar]
            [leiningen.deploy :as deploy]
            [leiningen.pom :as pom]))

(defn repository
  [project]
  (if (pom/snapshot? project)
    "snapshots"
    "releases"))

(defn identifier
  [project]
  (format "%s/%s" (:group project) (:name project)))

(defn version
  [project]
  (:version project))

(defn uberjar-file
  [project]
  (format "%s/%s" (:target-path project) (:uberjar-name project)))

(defn deploy-uberjar
  "Deploy uberjar and pom to remote repository."
  [project]
  (uberjar/uberjar project)
  (deploy/deploy project
                 (repository project)
                 (identifier project)
                 (version project)
                 (jar/get-jar-filename project :standalone)
                 (pom/pom project)))
