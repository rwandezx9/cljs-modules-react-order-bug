(require '[cljs.build.api :as b])

(println "Building ...")

(let [start (System/nanoTime)]
  (b/build "src"
           {:output-dir "release"
            :modules {:moduleb {:output-to "release/moduleb.js"
                                :entries #{'mies.moduleb}}
                      :core {:output-to "release/core.js"
                             :entries #{'mies.core}}}
            :optimizations :advanced
            :pretty-print true})
  (println "... done. Elapsed" (/ (- (System/nanoTime) start) 1e9) "seconds"))
