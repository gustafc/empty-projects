(ns emptylein.one-test
  (:require [clojure.test :refer :all]
            [emptylein.one :refer :all]))

(deftest a-test
  (testing "One is one"
    (is (= (one) 1))))
