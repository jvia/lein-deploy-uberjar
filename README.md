# deploy-uberjar

A Leiningen plugin to deploy uberjars.

## Usage

Use this for user-level plugins:

Put `[io.gamayun/deploy-uberjar "0.1.0-SNAPSHOT"]` into the `:plugins` vector of your `:user`
profile.

Use this for project-level plugins:

Put `[io.gamayun/deploy-uberjar "0.1.0-SNAPSHOT"]` into the `:plugins` vector of your project.clj.

Deploying an uberjar:

    $ lein deploy-uberjar

## License

Copyright © 2021 FIXME

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
