;; Problem 7, conj on vectors
;;
;; https://4clojure.oxal.org/#/problem/7

(ns problem7)

(assert (= [1 2 3 4] (conj [1 2 3] 4)))

(assert (= [1 2 3 4] (conj [1 2] 3 4)))
