(ns destruct)


(defn Destruct
  []
  (def myVector [1 2 3 4])

  ;; let takes a vector of variables and their source
  (let [[a b c] myVector] (println a b c))

  ;; you can also reference the rest of the vector
  (let [[a b & rest] myVector] (println a b rest))

  ;; reminds me of patternmatchin with elixir tbh
  (def myMap {'name "John" 'age 30})
  (let [{a 'name b 'age} myMap] (println a b))

  ;; in the case there is no other value to pattern match, then nil is returned
  (let [{a 'name b 'age c 'noname} myMap] (println a b c))
  
  )