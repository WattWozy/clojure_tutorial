(ns conditionals)


;; simple if conditional
(defn CondIf
  []
  (println "\nCondIf")
  (if (= 5 6)
    (println "Equal")
    (println "Not Equal")))
(CondIf)

;; if else kind of conditional
(defn CondIfDo
  []
  (println "\nCondIfDo")
  (if (= 5 5)
    (do
      (println "Equal")
      (println "Still Equal"))
    (do
      (println "Not Equal"))))
(CondIfDo)

;; nested if conditional
(defn CondIfNested
  []
  (println "\nCondIfNested")
  (if (and (= 5 5) (= 6 6) (or (= 2 2) (not true)))
    (println "true")
    (println "false")))
(CondIfNested)

;; cond case
(defn CondCase
  [pet]
  (println "\nCondCase")
  (def pet "dog")
  (case pet
        "dog" (println "woof")
        "cat" (println "meow")
        "bird" (println "chirp")
        :else (println "unknown")))
(CondCase "dog")

;; cond cond 
(defn CondCond
  [amount]
  (println "\nCond cond")
   (cond 
     ;; evaluates the first appliccable
     (< amount 0) (println "negative")
     (< amount 1) (println "just one")
     (> amount 1) (println "several")
     :else (println "many")))
