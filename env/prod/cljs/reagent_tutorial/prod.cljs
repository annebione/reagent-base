(ns reagent-tutorial.prod
  (:require [reagent-tutorial.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
