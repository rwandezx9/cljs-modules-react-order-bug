(ns mies.core
  (:require [clojure.browser.repl :as repl]
            [cljs.loader :as loader]
            [goog.dom :as gdom]))

(.appendChild (gdom/getElement "test")
              (gdom/createDom "a" #js {:onclick (fn [e]
                                                  (js/console.log "Link to load Module B clicked")
                                                  (loader/load :moduleb
                                                               (fn [e] 
                                                                 ((resolve 'mies.moduleb/init)))))} "Click to load Module B!"))
