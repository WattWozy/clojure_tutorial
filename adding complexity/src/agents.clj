;; agents are like atoms but they can be used for asynchronous programming
;; atoms wait for the change to occur, in a synchronous manner

(ns agents) 

(defn agents
  []
  (def amount (agent 100))
  (println "Initial amount: " @amount) ;; just as atoms, agents are accessed with a @
  (send amount inc)
  (println "Initial amount: " @amount) ;; you havn't waited for the value to update, so no change seen 
  (println "Waiting for the change to occur...")
  (println @amount) ;; now the change has occurred

  (send amount inc)
  (await-for 1000 amount) ;; await 1000ms for amount to update. 
  (println @amount) ;; now the change has occurred

  (println agent-error amount) ;; check if there were any errors during the change

)