# github-actions-packages

[[file:https://img.shields.io/clojars/v/github-actions-packages/lein-template.svg]]

A Leiningen template for deploying a library to github packages. Namely used
 for deploying packages in a private organization. No configuration required
  as github handles the deployment from the master branch.

## Usage
```.sh
lein new github-actions-packages mylibrary
```

## Testing

See: https://github.com/technomancy/leiningen/blob/master/doc/TEMPLATES.md#testing-your-template

To install locally

```sh
lein install
```
## Deploy


```sh 
lein deploy clojars
```
