(ns day-4.core
  (:require [pandect.algo.md5 :as md5]))

(def input "yzbqklnj")

(defn -main []
  (loop [counter 1
         hash (md5/md5 (str input counter)) ]
    (if (.startsWith hash "000000") (- counter 1) (recur (+ counter 1) (md5/md5 (str input counter)) ))))