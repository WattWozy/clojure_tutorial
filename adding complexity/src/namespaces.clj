(ns namespaces (:gen-class)
     (:require [clojure.string :as str])             ;; here you are giving an alias to an import
    (:require [clojure.string :refer [capitalize]])) ;; here you are importing only a function
 
;; string in clojure is a namespace as well

(defn -main
  []
  (println (str/capitalize "hello") "world")   ;; referring to the imported namespace's function
  (println (capitalize "hello") "world"))      ;; here you are using the imported function without the namespace


