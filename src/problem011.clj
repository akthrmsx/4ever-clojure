;; Problem 11, conj on maps
;;
;; https://4clojure.oxal.org/#/problem/11

(ns problem011)

(assert (= {:a 1, :b 2, :c 3} (conj {:a 1} [:b 2] [:c 3])))
