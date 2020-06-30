# {{raw-name}}

A library for {{raw-name}}...

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
    $ lein release
```

