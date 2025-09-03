Clojure Tutorial

Clojure is a modern Lisp: simple syntax, immutable data, and powerful abstractions. This repo shows its essentials through small, sharp examples.

🔑 Core Syntax
;; Lists and function calls
(+ 1 2 3)        ;; => 6
(str "Hello" " " "World") ;; => "Hello World"

;; Bindings
(let [x 10
      y 20]
  (+ x y))       ;; => 30

;; Functions
(defn square [n] (* n n))
(square 5)       ;; => 25

📦 Data Structures
;; Immutable vectors, lists, maps, sets
[1 2 3]              ;; vector
'(a b c)             ;; list
{:a 1 :b 2}          ;; map
#{1 2 3}             ;; set

;; Destructuring
(let [{:keys [a b]} {:a 1 :b 2}]
  (+ a b))           ;; => 3

⚡ Functional Power
(map inc [1 2 3])          ;; => (2 3 4)
(filter even? (range 10))  ;; => (0 2 4 6 8)
(reduce + [1 2 3 4])       ;; => 10

🔄 Concurrency
(def counter (atom 0))
(swap! counter inc)   ;; => 1

🌀 Macros
(defmacro unless [pred body]
  `(if (not ~pred) ~body))

(unless false (println "Runs!"))


✨ With just a few primitives, Clojure unlocks expressive, concurrent, and extensible programming.
