(ns car-dealers (:gen-class))


;; 3 types of cars: 
;; bmw 60k
;; ferrari 100K
;; fiat 20K

;; coupon code with 20% discount

;; the function takes in the budget code
;; returns the car prices 

;; function takes in the client's budget as well
;; returns the car prices in the budget (discounted prices)


;; if the coupon is not valid, print it's not valid, and return the ones in budget

;; define the new datatypes
(defstruct car :name :price)
(defstruct coupon :code :valid-until)
(def current_date 20251022)

;; define the objects
(def BMW (struct-map :name "BMW" :price (atom 60000)))
(def FERRARI (struct-map :name "Ferrari" :price (atom 100000)))
(def FIAT (struct-map :name "Fiat" :price (atom 20000)))

(def VALID_COUPON (struct-map :code "20%OFF" :valid-until  20251023 :amount 20))
(def INVALID_COUPON (struct-map :code "50%OFF" :valid-until 20250811 :amount 50))

;; define the sequences
(def products [BMW FERRARI FIAT])


;; define the functions
(defn validate_coupon [coupon]
  (if (<= (:valid_until coupon) current_date)
    true
    false))


(defn check-offers
  [products coupon budget]
  (if(validate_coupon coupon)
   (doseq [model products]
     (swap! (:price model) #(* % (- 1 (/ (:amount coupon) 100))))
   ))
  
  (doseq [model products]
    (if (<= (@(:price model)) budget)
      (println (:name model) ": " @(:price model)))
  ))


(defn -main []
  (println "Available offers")
  (check-offers products VALID_COUPON 60000))

;;#########################################
;; ########### solution from tutorial! ####
;;#########################################


(defn isCodeValid 
  [code]
  [defstruct coupon :Name :Discount]
  (def validCoupon (struct coupon "20Percent" 0.8))
  (if (= code (:Name validCoupon))
    true
    false))

(defn getCarPrices
  [budget code]
  (def cars {"bmw" 60000 "ferrari" 100000 "fiat" 20000})
  (if (isCodeValid code)
    (do 
      (println "The code is valid")
      (def discount (:Discount (validCoupon)))
      (doseq [car cars]
        (def carType (first car))
        (def carPrice (last car))
        (def discountedPrice (* carPrice discount))
        (if (<= discountedPrice budget)
          (println carType ": " discountedPrice))))
    (do
      (println "Invalid coupon code")
      (doseq [car cars]
        (def carType (first car))
        (def carPrice (last car))
        (if (<= carPrice budget)
          (println carType ": " carPrice))))
    ))
(getCarPrices 60000 "20Percent")