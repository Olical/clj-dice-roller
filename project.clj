(defproject dice-roller "0.1.0-SNAPSHOT"
  :description "Rolls a set of dice (example of transcriptor)"
  :url "https://github.com/Olical/clj-dice-roller"
  :license {:name "Unlicense"
            :url "https://unlicense.org/"}
  :profiles {:dev {:source-paths ["src" "repls"]}}
  :aliases {"repls" ["run" "-m" "repl-runner"]}
  :dependencies [[org.clojure/clojure "1.9.0-beta1"]
                 [org.clojure/spec.alpha "0.1.123"]
                 [com.cognitect/transcriptor "0.1.5"]])
