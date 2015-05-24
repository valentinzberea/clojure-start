(ns clojure-start.hello)

(defn ^:export main []
  (.write js/document "<p>Hello, world!</p>"))
