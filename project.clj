(defproject shouter "0.1.0-SNAPSHOT"
  :description "Shouter app"
  :url "http://github.com/ffrmns/shouter"
  :license {:name "Eclipse Public License"
            :url "https://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [org.clojure/java.jdbc "0.7.12"]
                 [org.postgresql/postgresql "42.3.6"]
                 [ring/ring-jetty-adapter "1.9.5"]
                 [compojure "1.7.0"]]
  :repl-options {:init-ns shouter.core})
