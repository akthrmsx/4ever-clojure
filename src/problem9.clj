;; Problem 9, conj on sets
;;
;; https://4clojure.oxal.org/#/problem/9

(ns problem9)

(assert (= #{1 2 3 4} (conj #{1 4 3} 2)))
