(ns mies.moduleb
  (:require [cljs.loader]
            [cljsjs.react]
            [cljsjs.react.dom]))

(defn init []
  (js/console.log "Module B init"))
