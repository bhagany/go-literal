(ns go-literal.core
  (:require [cljs.core.async :refer [chan]])
  (:require-macros [cljs.core.async.macros :refer [go]]))

(go
  (let [text "yo"
        params #js {:key text}]
    params))
