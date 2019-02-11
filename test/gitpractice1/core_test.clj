(ns gitpractice1.core-test
  (:require [clojure.test :refer :all]
            [gitpractice1.core :refer :all]))

(deftest a-test
  (testing "i just edited this 1"
    (is (= 0 1))))
