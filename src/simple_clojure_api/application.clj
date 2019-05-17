(ns simple-clojure-api.application
  (:require [org.httpkit.server :refer [run-server]]))

(defn app [req]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    (str "Hello world!")})

(defn -main [& args]
  (run-server app {:port 8081})
  (println "Server started on port 8081"))
