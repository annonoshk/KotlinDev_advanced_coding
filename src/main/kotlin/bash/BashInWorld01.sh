#!/usr/bin/env bash
set -euo pipefail

function add() {
    echo $(( $1 + $2 ))
}

function subtract() {
    echo $(( $1 - $2 ))
}

case $1 in
    add )
        add $2 $3;;
    subtract )
        subtract $2 $3;;
    * )
        echo "unknown operation";;
esac