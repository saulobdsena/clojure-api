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

(def chave "17718241908c7cde8bd88c7a3beb35d8d80e75a011fc5d73222ff408d952c454")


(def opcoes-do-programa
[["-d" "--de moeda base" "moeda base para conversão"
:default "eur"]
["-p" "--para moeda distino"
      "moeda a qual queremos saber o valor"]])

(defn -main
  "Meu proprio main"
  [& args]
  (prn "as opções são" (:options
  (parse-opts args opcoes-do-programa))))
