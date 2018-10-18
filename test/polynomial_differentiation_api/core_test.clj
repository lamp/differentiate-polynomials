(ns polynomial-differentiation-api.core-test
  (:require [cheshire.core :as cheshire]
            [clojure.test :refer :all]
            [polynomial-differentiation-api.handler :refer :all]
            [ring.mock.request :as mock]))

(deftest a-test

  (testing "Test GET request to /differentiate/4/3/2/1 returns expected response"
    (let [response (app (-> (mock/request :get  "/differentiate/4/3/2/1")))]
      (is (= (:status response) 200))
      (is (= (:body response) "12x^2+6x+2")))))
