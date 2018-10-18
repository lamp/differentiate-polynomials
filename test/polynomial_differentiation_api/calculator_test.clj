(ns polynomial-differentiation-api.calculator-test
  (:require [clojure.test :refer [deftest is testing]]
            [polynomial-differentiation-api.calculator :as subject]))

(deftest differentiate-test
  (testing "Differentiates given correct arguments"
    (is (= [[6 1] [2 0]]
           (subject/differentiate [3 2 1]))) 
    (is (= [[12 2] [6 1] [2 0]]
           (subject/differentiate [4 3 2 1])))
    (is (= [[12 2] [6 1]]
           (subject/differentiate [4 3 0 1])))
    (is (= [[12 2] [-10 1]]
           (subject/differentiate [4 -5 0 1])))))
