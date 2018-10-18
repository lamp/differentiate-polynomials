(ns polynomial-differentiation-api.core-test
  (:require [cheshire.core :as cheshire]
            [clojure.test :refer :all]
            [polynomial-differentiation-api.handler :refer :all]
            [ring.mock.request :as mock]))

(defn parse-body [body]
  (cheshire/parse-string (slurp body) true))

(deftest a-test

  (testing "Test GET request to /api/differentiate/1/1 returns expected response"
    (let [response (app (-> (mock/request :get  "/api/differentiate/1/1")))
          body     (parse-body (:body response))]
      (is (= (:status response) 200))
      (is (= (:result body) 3)))))
