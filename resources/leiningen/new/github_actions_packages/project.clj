(defproject {{raw-name}} "0.1.0-SNAPSHOT"
            :description "FIXME: write description"
            :url "http://github.com/{{raw-name}}"

            :dependencies [[org.clojure/clojure "1.10.1"]]

            :release-tasks [["vcs" "assert-committed"]
                            ["change" "version" "leiningen.release/bump-version" "release"]
                            ["vcs" "commit"]
                            ["vcs" "push"]
                            ["change" "version" "leiningen.release/bump-version"]
                            ["vcs" "commit"]
                            ["vcs" "push"]]

            :repositories [["github" {:url "https://maven.pkg.github.com/{{raw-name}}"
                                      :username :env/github_actor
                                      :password :env/github_token
                                      :sign-releases false}]])
