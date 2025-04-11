;; Problem 5, conj on lists
;;
;; https://4clojure.oxal.org/#/problem/5

(ns problem005)

(assert (= '(1 2 3 4) (conj '(2 3 4) 1)))

(assert (= '(1 2 3 4) (conj '(3 4) 2 1)))
