(ns forge-compiler.helpers.file
    (:require [clojure.java.io :as io]))

(defn is-file
    [path]
    (.exists (io/file path)))

(defn is-dir
    [path]
    (.isDirectory (io/file path)))