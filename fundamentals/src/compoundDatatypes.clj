(ns compoundDatatypes
  (:gen-class))


;; sets: 
;; IMMUTABLE
;; sets can be embedded into sets
;; can include different types of values
;; tree-based: EFFICIENT

#{}
#{1 42 1.5 "PET" 'cat}

;; maps: 
;; IMMUTABLE
;; EFFICIENT
;; KEY-VALUE PAIRS

#{:key1 "value1"}
#{1 42, 2 1.5, "pet" 'cat}


;; vectors: 
;; IMMUTABLE
;; EFFICIENT
;; INDEXED

[]
[1 2 3 4]
[1 42 1.5 "PET" 'cat]

;; lists: 
;; IMMUTABLE
;; EFFICIENT
;; LINKED


;;(1 2 3 4) ;; throwing some error?
;;(1 "TWO" 'three ) ;; also throwing some error?
(defn foo [] (println "hello"))
(foo)