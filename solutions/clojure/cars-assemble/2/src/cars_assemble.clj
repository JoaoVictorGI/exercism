(ns cars-assemble)

(defn production-rate
  "Returns the assembly line's production rate per hour,
   taking into account its success rate"
  [speed]
  (cond (== speed 1 (or <= speed 4)) (double (* 221 speed))
        (<= speed 8) (double (* (* 221 speed) 0.9))
        (== speed 9) (double (* (* 221 speed) 0.8))
        (== speed 10) (double (* (* 221 speed) 0.77))
        :else 0))

(production-rate 6)

(defn working-items
  "Calculates how many working cars are produced per minute"
  [speed]
  (int (/ (production-rate speed) 60)))

(working-items 6)
