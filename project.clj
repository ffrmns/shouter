(defproject shouter "0.1.0-SNAPSHOT"
  :description "Shouter app"
  :url "http://github.com/ffrmns/shouter"
  :license {:name "Eclipse Public License"
            :url "https://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.9.8"
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [org.clojure/java.jdbc "0.7.12"]
                 [org.postgresql/postgresql "42.3.6"]
                 [ring/ring-jetty-adapter "1.9.5"]
                 [compojure "1.7.0"]
                 [ring/ring-defaults "0.3.3"]
                 [hiccup "1.0.5"]]
  :main ^:skip-aot shouter.web
  :uberjar-name "shouter-standalone.jar"
  :plugins [[lein-ring "0.12.6"]]
  :ring {:handler shouter.web/application
         :init shouter.models.migration/migrate}
  :profiles {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                                  [ring/ring-mock "0.4.0"]]}
             :uberjar {:aot :all}})
