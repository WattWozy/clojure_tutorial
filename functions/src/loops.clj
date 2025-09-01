(ns loops)

;; simple when loop
(defn Loop
  []
  (println "\nLoop")
  (loop [x 0]
    (when (< x 10)
      (println x)
      (recur (inc x)))))
(Loop)

;; number of iterations
(defn DoTimes
  []
  (println "\nDoTimes")
  (dotimes [x 10]
    (println x)))
(DoTimes)

;; coditional iterations: whiledo
(defn WhileDo
  [count]
  (println "\nWhileDo")
  (def x (atom 0))
  (while (< @x count)
    (println @x)
    (swap! x inc)))
(WhileDo 10)

;; iterating in a sequence
(defn DoSeq
  [seq]
  (println "\nDoSeq")
  (doseq [x seq]
    (println (inc x))))
(DoSeq [5 2 7 9 2 0])

