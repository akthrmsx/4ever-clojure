;; Problem 10, Maps
;;
;; https://4clojure.oxal.org/#/problem/10

(ns problem010)

(assert (= 20 ((hash-map :a 10, :b 20, :c 30) :b)))

(assert (= 20 (:b {:a 10, :b 20, :c 30})))
