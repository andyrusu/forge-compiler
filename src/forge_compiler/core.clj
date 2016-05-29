(ns forge-compiler.core
    (:require [clojure.tools.cli :refer [parse-opts]]
              [forge-compiler.helpers.file :as f])
    (:gen-class))
  
(def accepted-types ["ast" "clj"])
  
(def cli-options 
  [[nil "--type TYPE" "The conversion TYPE (ast or clj)."
    :default :ast
    :validate [#(some #{%} accepted-types) "Only accepted values are ast and clj."]]
   ["-f" "--from PATH" "The source path or file."
    :default "."
    :validate [(fn [path] (or (f/is-file path) (f/is-dir path))) "Must be a valid path to a file or folder."]]
   ["-t" "--to PATH" "The source path or file."
    :default "."
    :validate [(fn [path] (or (f/is-file path) (f/is-dir path))) "Must be a valid path to a file or folder."]]])
  
(defn -main
  [& args]
  (parse-opts args cli-options))