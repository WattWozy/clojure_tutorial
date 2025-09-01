(ns sequences)


;; lists grow at the beginning
;; vectors grow at the end

(defn Sequence
  []
  (def colors (seq ["red" "green" "blue"]))
  (println colors)
  
  ;; cons: appends a new value to the sequence
  (println (cons "yellow" colors))

  ;; cons can also appends two sequence
  (println (cons colors "yellow")) ;; in this case a string is also a sequence
  
  ;; conj: appends a new value to the end of the sequence
  (println (conj colors "yellow"))

  ;; concat: combines two sequences
  (println (concat colors (seq ["black" "orange"])))

  ;; distinct: removes duplicate values from a seq
  (println (distinct (seq [1 2 1 32 4 3 2 5 4 4 22])))

  ;; reverse: reverses the order of elements in a sequence
  (println (reverse colors))

  ;; first: returns the first element of a sequence
  (println (first colors))

  ;; rest: returns the sequence without the first element
  (println (rest colors))

  ;; sort: returns a sorted sequence
  (println (sort colors))
  )