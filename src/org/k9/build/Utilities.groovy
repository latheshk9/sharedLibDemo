package org.k9.build 
def checkOutFrom(repo) {
  git url: "git@github.com:jenkinsci/${repo}"
}

return this
