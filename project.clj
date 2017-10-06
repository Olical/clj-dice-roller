(defproject dice-roller "0.1.0-SNAPSHOT"
  :description "Rolls a set of dice (example of transcriptor)"
  :url "https://github.com/Olical/clj-dice-roller"
  :license {:name "Unlicense"
            :url "https://unlicense.org/"}
  :profiles {:dev {:source-paths ["src" "repls"]}}
  :plugins [[lein-transcriptor "1.0.0"]]
  :dependencies [[org.clojure/clojure "1.9.0-beta1"]
                 [com.cognitect/transcriptor "0.1.5"]])
