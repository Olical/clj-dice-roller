(ns dice-roller.core)

(defn roll
  "Rolls some dice, like (roll 3 6) would be three d6."
  [amount die]
  (vec (map #(inc (rand-int %)) (filter pos? (repeat amount die)))))
