(ns structmaps)

;; structs are a way to define a new data type
;; defstruct is a way to define a new struct type
(defstruct Pet :PetType :PetName)

(defn Pets
  []

  (def myPet (struct Pet "Dog" "Fido"))
  (println myPet)

  ;; struct-map is a way to create a new struct instance with a map of values
  (def myOtherPet (struct-map Pet :PetType "Dog" :PetName "Fido"))
  (println myOtherPet)
  (println (:PetType myPet))
  (println (:PetName myOtherPet))
  
  ;; assoc creates a new "object" with some changed variable value
  (def myNewPet (assoc myPet :PetName "Rex"))
  (println myNewPet))