(defproject org.clojars.brandonw/lein-nailgun "1.0.0"
  :description "A leiningen plugin to launch a vimclojure nailgun server."
  :url "http://github.com/brandonw/lein-nailgun"
  :dependencies [[org.clojars.gilbertl/vimclojure "2.1.2"]
                 [org.apache.maven/maven-ant-tasks "2.0.10"]
                 [vimclojure/server "2.2.0"]]
  :dev-dependencies [[lein-clojars "0.5.0-SNAPSHOT"]]
  :repositories {"clojars" "http://clojars.org/repo"})

