(ns conversor.core
  (:gen-class))

;Importand o a função parse-opts do clj.tools
(ns conversor.core
(:require [clojure.tools.cli :refer [parse-opts]])
(:gen-class))


;(defn- valores-em [arg]
; (cond
; (.startsWith arg "--de=")
;  {:de (subs arg 5)}
; (.startsWith arg "--para=")
;  {:para (subs arg 7)}
; :else {}))



(defn -main
  "Meu proprio main"
  [& args]
  (println "os argumentos são:" (map valores-em args))
  )
