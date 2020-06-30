(ns leiningen.new.github-actions-packages
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files project-name sanitize-ns]]
            [leiningen.core.main :as main]))

(def render (renderer "github-actions-packages"))

(defn github-actions-packages
  [name]
  (let [data {:raw-name name ; organization/project
              :name (project-name name) ; project
              :namespace (sanitize-ns name) ; organization.project
              :sanitized (name-to-path name)}] ; organization/project
    (main/info "Generating fresh 'lein new' github-actions-packages in" (project-name name))
    (->files data
             [".github/workflows/clojure.yml" (render "clojure.yml" data)]
             [".github/workflows/deploy.yml" (render "deploy.yml" data)]
             [".gitignore" (render "gitignore" data)]
             ["src/{{sanitized}}/core.clj" (render "core.clj" data)]
             ["test/{{sanitized}}/core_test.clj" (render "core_test.clj" data)]
             ["README.md" (render "README.md" data)]
             ["project.clj" (render "project.clj" data)])))
