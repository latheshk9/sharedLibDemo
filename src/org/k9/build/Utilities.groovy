package org.k9.build 
def checkOutFrom(repo) {
  git url: "git@github.com:latheshk9/${repo}"
}

return this
