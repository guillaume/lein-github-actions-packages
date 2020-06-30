# {{name}}

A library for name...

## Test

```sh
lein test
```
PR checks are handles by github action 

## Deployment

Deployments are automatically deployed to [github packages](https://github.com/{{raw-name}}/packages) by 
[github actions](.github/workflows/deploy.yml) for both snapshots and
 releases upon pushing to the master branch.
 
### Release

To trigger a release version increase in the project
```
lein release
```

## Require this lib

To include this library in a dependent project, include the following

```clojure
:repositories [["{{raw-name}}"
                {:url "https://maven.pkg.github.com/{{raw-name}}"
                 :username [:gpg :env/github_actor]
                 :password [:gpg :env/github_token]}]]
``` 
