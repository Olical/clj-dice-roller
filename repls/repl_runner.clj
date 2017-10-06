(ns repl-runner
  (:require [cognitect.transcriptor :as xr]))

(defn -main []
  (doseq [repl-file (xr/repl-files "./repls")]
    (xr/run repl-file)))

(-main)
