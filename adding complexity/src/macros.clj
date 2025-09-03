(ns macros)

(macroexpand-1 '(when true (println "hello")))

;; a macro in clojure is a special form that allows you to manipulate code as data