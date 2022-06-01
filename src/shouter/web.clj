(ns shouter.web
  (:require [compojure.core :refer [defroutes GET]]
            [ring.adapter.jetty :as ring]
            [hiccup.page :as page]))

(defn index []
  (page/html5
    [:head
     [:title "Hello World"]]
    [:body
     [:div {:id "content"} "Hello World"]]))

(defroutes routes
  (GET "/index" [] (index))
  (GET "/" [] "<h2>Hello World</h2>"))

(defn -main []
  (ring/run-jetty #'routes {:port 8080 :join? false}))
