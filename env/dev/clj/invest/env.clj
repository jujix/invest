(ns invest.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [invest.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[invest started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[invest has shut down successfully]=-"))
   :middleware wrap-dev})
