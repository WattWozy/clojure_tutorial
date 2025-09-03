(ns watchers) 

;; to react to a sudden change

(defn Watch 
  []
  (def x (atom 5))
  (add-watch x :xWatcher         ;; watch for changes to x
             (fn [key atom old-state new-state]                         ;; this function is called whenever x changes
               (println "x changed from" old-state "to" new-state)))
  (reset! x 10)                  ;; resetting the value of x
  (remove-watch x :xWatcher)     ;; this deletes your watches
  (reset! x 15)                  ;; you deleted the watch, so no notification will be triggered
  )