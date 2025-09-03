;; we want to be able to retrieve the human years of a pet.



;; dogs are seven times the age of a human
;; cats are five times the age of a human
;; fish are ten times the age of a human

(defn main [pet age]
  cond
  (= pet "dog") (* age 7)
  (= pet "cat") (* age 5)
  (= pet "fish") (* age 10)
  :else (str "I don't know the age of a " pet))


(defn alternative-main [pet age]
  (def petset {"dog" 7, "cat" 5, "fish" 10})
  (println (* (get petset pet) age)))


;; tutorial solution
(defn petToHumanAge
  [x]
  (def petStore {'dog 7, 'cat 5, 'fish 10})
  (get petStore x))

(defn age
  [petName petType petAge]
  (def ratio (petToHumanAge petType))
  (println petName "is" (* ratio petAge) "human years old"))

(age "Fido" 'dog 4)
(age "Fifi" 'cat 2)
(age "Goldie" 'fish 10)