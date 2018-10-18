(ns polynomial-differentiation-api.helpers-test
  (:require [clojure.test :refer [deftest testing is]]
            [polynomial-differentiation-api.helpers :as subject]))

(deftest parse-input-test
  (testing "parses well formed input"
    (is (= [1 2 3]
           (subject/parse-input "1/2/3")))))

(deftest render-test
  (testing "renders default case"
    (is (= "12x^2+6x+2"
           (subject/render [[12 2] [6 1] [2 0]])))
    (is (= "12x^2+6x"
           (subject/render [[12 2] [6 1]])))))
