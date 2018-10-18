(ns polynomial-differentiation-api.handler
  (:require [compojure.api.sweet :refer :all]
            [clojure.string :refer [split]]
            [polynomial-differentiation-api.helpers :as helpers]
            [polynomial-differentiation-api.calculator :as calculator]
            [ring.util.http-response :refer :all]))


(def app
  (api
    {:swagger
     {:ui "/"
      :spec "/swagger.json"
      :data {:info {:title "Polynomial-differentiation-api"
                    :description "Differentiate Polynomials over HTTP"}
             :tags [{:name "api"}]}}}

    (GET "/differentiate/:inputs{.*}" []
         :path-params [inputs]
         :summary "Differentiate a polynomial"
         (ok  (-> inputs
                  helpers/parse-input
                  calculator/derive-polynomial-pairs
                  helpers/render)))))
