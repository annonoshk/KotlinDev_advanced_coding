#!/usr/bin/env bash

case "${1}" in

    "")
        echo "No option was selected."
        ;;
    1 | 'a')
        echo "You either selected '1' or 'a'."
        ;;
    2 | 'b')
        echo "You either selected '2' or 'b'."
        ;;
    3 | 'c')
        echo "You either selected '3' or 'c'."
        ;;
    *)
        echo "Unknown character '${1}'."
        ;;

esac