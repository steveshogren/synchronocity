(ns synchronicity.core
  (:gen-class)
  (:use clojure.test))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))


(defn merge-row [row currentrow]
  (if (> (:v row) (:v currentrow))
    row
    currentrow))

(defn merge-row-date [row currentrow]
  (if (> (:date row) (:date currentrow))
    row
    currentrow))

(defn now [] (java.util.Date.))
(defn after [d1 d2] (.after d1 d2))

(with-redefs [after (fn [x y] true)]
  (let [f (now)
         s (now)]
     (after f s)))




