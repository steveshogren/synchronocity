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

(= {:k "pass" :val "new" :v 2}  
     (merge-row {:k "pass" :val "new" :v 2}
                {:k "pass" :val "old" :v 1}))

(= {:k "pass" :val "new" :v 2}  
     (merge-row {:k "pass" :val "old" :v 1}
                {:k "pass" :val "new" :v 2}))

(= {:k "pass" :val "old" :v 2}  
     (merge-row {:k "pass" :val "new" :v 2}
                {:k "pass" :val "old" :v 2}))



