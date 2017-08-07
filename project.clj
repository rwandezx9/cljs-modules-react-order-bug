(defproject mies "0.1.0"
  :dependencies [[org.clojure/clojure "1.9.0-alpha17"]
                 [org.clojure/clojurescript "1.9.854"]
                 [cljsjs/react-with-addons "15.5.4-0"]
                 [cljsjs/react-dom "15.5.4-0" :exclusions [cljsjs/react]]] 

  :plugins [[lein-cljsbuild "1.1.7"]]

  :cljsbuild {:builds [{:id "release"
                        :source-paths ["src"]
                        :compiler {:output-dir "release"
                                   :modules {:moduleb {:output-to "release/moduleb.js"
                                                       :entries #{mies.moduleb}}
                                             :core {:output-to "release/core.js"
                                                    :entries #{mies.core}}}
                                   :optimizations :advanced
                                   :optimize-constants false
                                   :pretty-print false}}]})
