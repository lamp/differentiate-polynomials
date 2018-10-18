(defproject polynomial-differentiation-api "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [ring/ring-core "1.7.0"]
                 [ring-server "0.5.0"]
                 [org.clojure/spec.alpha "0.2.176"]
                 [metosin/compojure-api "1.1.11"]]
  :ring {:handler polynomial-differentiation-api.handler/app
         :auto-reload? true
         :nrepl {:start? true
                 :port 9009}}
  :uberjar-name "server.jar"
  :profiles {:dev {:dependencies [[javax.servlet/javax.servlet-api "3.1.0"]
                                  [cheshire "5.5.0"]
                                  [ring/ring-mock "0.3.0"]
                                  [cider/cider-nrepl "0.18.0"]]
                   :plugins [[lein-ring "0.12.0"]]
                   :repl-options {:nrepl-middleware
                                  [cider.nrepl/wrap-apropos
                                   cider.nrepl/wrap-classpath
                                   cider.nrepl/wrap-complete
                                   cider.nrepl/wrap-debug
                                   cider.nrepl/wrap-format
                                   cider.nrepl/wrap-info
                                   cider.nrepl/wrap-inspect
                                   cider.nrepl/wrap-macroexpand
                                   cider.nrepl/wrap-ns
                                   cider.nrepl/wrap-spec
                                   cider.nrepl/wrap-pprint
                                   cider.nrepl/wrap-pprint-fn
                                   cider.nrepl/wrap-profile
                                   cider.nrepl/wrap-refresh
                                   cider.nrepl/wrap-resource
                                   cider.nrepl/wrap-stacktrace
                                   cider.nrepl/wrap-test
                                   cider.nrepl/wrap-trace
                                   cider.nrepl/wrap-out
                                   cider.nrepl/wrap-undef
                                   cider.nrepl/wrap-version]}}})
