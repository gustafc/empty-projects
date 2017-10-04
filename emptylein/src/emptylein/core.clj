(ns emptylein.one
  (:require [clojure.test :refer [is]]))

(defn one
  "Returns one"
  {:test #(do
            (is (= 1 (one)))
            )}
  []
  1)
