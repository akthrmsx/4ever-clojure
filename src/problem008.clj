;; Problem 8, Sets
;;
;; https://4clojure.oxal.org/#/problem/8

(ns problem008
  (:require [clojure.set :as set]))

(assert (= #{:a :b :c :d} (set '(:a :a :b :c :c :c :c :d :d))))

(assert (= #{:a :b :c :d} (set/union #{:a :b :c} #{:b :c :d})))
