#!/usr/bin/env bash

case "${1}" in

    "")
        echo "No option was selected."
        ;;
    1)
        echo "You selected '1'."
        ;;
    2)
        echo "You selected '2'."
        ;;
    3)
        echo "You selected '3'."
        ;;
    *)
        echo "Unknown number '${1}'."
        ;;

esac