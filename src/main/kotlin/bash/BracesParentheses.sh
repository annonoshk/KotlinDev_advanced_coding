package bash

#!usr/bin/env/bash

name="Alice"

[[ $name = *c* ]] && echo "Name includes c"

echo $?