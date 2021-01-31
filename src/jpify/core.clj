(ns jpify.core
    (:require [clj-http.client :as client])
    (:require [clojure.string :as s])
    (:require [environ.core :refer [env]]))

(def uri "https://api.ipify.org/")

(def user-agent 
    (str 
        "jpify/" (:jpify-version env) 
        " clojure/" (s/join \. [
            (:major *clojure-version*)
            (:minor *clojure-version*)
            (:incremental *clojure-version*)])
        " " (:os-name env) "/" (:os-version env)))

(defn- fetch [uri] (:body (client/get uri {"user-agent" user-agent})))

(defn get-ip
    ([] (fetch uri))
    ([fmt] (fetch (str uri "?format=" (name fmt))))
    ([fmt callback] (fetch (str uri "?format=" (name fmt) "&callback=" (name callback))))
)