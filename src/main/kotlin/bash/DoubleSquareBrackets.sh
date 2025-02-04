#!usr/bin/env/bash

#!/usr/bin/env bash

path='/local/user'

if [[ $path != *root* ]]; then
    rm ${1}
    echo "Specified file/directory was deleted"
else
    echo "Specified file/directory was NOT deleted"
       
fi