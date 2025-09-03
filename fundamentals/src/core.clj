(ns tutorial.functions
  (:gen-class))

(defn -main
  "First function"
  []
  (println "My name is Niklas")
  (println "loving clojure so far")
  (+ 2 5))

#(println "Hello" %)

(def increment (fn [x] (+ x 1 )))

(defn increment_set
  []
  (map increment [1 2 3 4 5]))

(defn increment_one
  [x]
  (map increment x))