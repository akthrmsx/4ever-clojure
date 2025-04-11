;; Problem 6, Vectors
;;
;; https://4clojure.oxal.org/#/problem/6

(ns problem006)

(assert (= [:a :b :c] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c)))
