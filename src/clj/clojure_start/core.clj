(ns clojure-start.core
  (:gen-class))

(defn say-hello [name]
  (println "Hello" name))

(defn show-reduce [arr]
  (let [result (reduce + arr)]
    (println result)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  [(say-hello "Valentin")
   (show-reduce [1 5 3])
  ])

