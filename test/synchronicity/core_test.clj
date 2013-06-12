(ns synchronicity.core-test
  (:use clojure.test
        synchronicity.core))

(deftest a-test
  (testing "merge-row"
    (is {:k "pass" :val "new" :v 2}  
       (merge-row {:k "pass" :val "new" :v 2}
                  {:k "pass" :val "old" :v 1}))
    (is {:k "pass" :val "new" :v 2}  
       (merge-row {:k "pass" :val "old" :v 1}
                  {:k "pass" :val "new" :v 2}))
    (is {:k "pass" :val "old" :v 2}  
       (merge-row {:k "pass" :val "new" :v 2}
                  {:k "pass" :val "old" :v 2}))))

