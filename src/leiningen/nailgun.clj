(ns leiningen.nailgun
  (:use [leiningen.compile :only [eval-in-project]]))

(defn nailgun
  "Launch a vimclojure nailgun server."
  ([project addr-port]
   (eval-in-project 
     project
     `(do (try (~'vimclojure.nailgun.NGServer/main
                   (into-array String [~addr-port]))
            (catch Exception e#
              (println e#)
              (println "Make sure vimclojure is added as a"
                       "dev-dependency in your project.clj."))))))
  ([project] (nailgun project "127.0.0.1")))
