(ns exceptions)


(defn Exceptions
  [x]
  (try
    (inc x)
    (catch ClassCastException e (println "ClassCastException: " (.getMessage e)))
    (catch Exception e (println "Unknown Exception: " (.getMessage e)))
    (finally (println "Finally allows you to run some last minute code after exceptions"))

  ))

(Exceptions "heloow!")