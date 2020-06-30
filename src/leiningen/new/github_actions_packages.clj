(ns leiningen.new.github-actions-packages
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files project-name sanitize-ns]]
            [leiningen.core.main :as main]))

(def render (renderer "github-actions-packages"))

(defn github-actions-packages
  [name]
  (let [data {:raw-name name
              :name (project-name name)
              :namespace (sanitize-ns name)
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' github-actions-packages.")
    (->files data
             [".github/workflows/clojure.yml" (render "clojure.yml" data)]
             [".github/workflows/deploy.yml" (render "deploy.yml" data)]
             [".gitignore" (render "gitignore" data)]
             ["README.md" (render "README.md" data)]
             ["project.clj" (render "project.clj" data)])))
