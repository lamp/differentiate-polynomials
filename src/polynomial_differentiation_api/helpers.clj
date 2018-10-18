(ns polynomial-differentiation-api.helpers
  (:require [clojure.string :refer [split]]))

(defn parse-input [inputs]
  (->> (split inputs #"/")
       (map #(Integer. %))))

(defn render [pairs]
  (->> pairs
       (map (fn [[c ex]]
              (cond
                (= 0 ex) c
                (= 1 ex) (str c "x")
                :else (str c "x^" ex))))
       (clojure.string/join "+")))

