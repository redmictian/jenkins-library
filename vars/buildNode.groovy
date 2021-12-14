#!/usr/bin/env groovy
def call() {
    echo "Managing dependencies for $BRANCH_NAME"
    sh 'npm --prefix ./app install'
}