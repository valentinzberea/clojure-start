(ns clojure-start.core)

(defn ^:export main []
  (.write js/document "<p>Hello, world!</p>"))
