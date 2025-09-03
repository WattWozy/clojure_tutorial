(ns atoms) 

;; atoms are thread-safe mutable references
(defn Atoms
  []
  (def amount (atom 100))
  (println @amount)
  
  ;; swaps applies a function to the atom's value
  (swap! amount inc)
  (println @amount)

  ;; sets the amount to a new value
  (reset! amount 110)

  ;; compare-and-set conditionally sets the atom's value checking true condition
  (compare-and-set! amount 110 150)
  (println @amount)
  )

(Atoms)