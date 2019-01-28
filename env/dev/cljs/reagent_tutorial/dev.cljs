(ns ^:figwheel-no-load reagent-tutorial.dev
  (:require
    [reagent-tutorial.core :as core]
    [devtools.core :as devtools]))

(devtools/install!)

(enable-console-print!)

(core/init!)
