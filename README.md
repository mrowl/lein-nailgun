# lein-nailgun

A leiningen plugin to launch a vimclojure nailgun server

## Installation

Make sure `:dev-dependencies` in your project.clj contains the following:

	:dev-dependencies [[org.clojars.brandonw/lein-nailgun "1.0.0"]]

## Known Issues

* The current version of vimclojure requires a version clojure 1.1 or earlier
  The development version of vimclojure is currently working on become agnostic
  as to which version of clojure you use.
