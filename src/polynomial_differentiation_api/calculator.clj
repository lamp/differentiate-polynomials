(ns polynomial-differentiation-api.calculator)

(defn differentiate
  [coefficients]
  (let [exponents (-> coefficients
                      count
                      range
                      reverse)
        derived-values (map (fn [c ex]
                              [(* c ex) (dec ex)])
                            (butlast coefficients)
                            exponents)]
    (vec (remove (fn [pair]
                   (= 0 (reduce + pair)))
                 derived-values))))
