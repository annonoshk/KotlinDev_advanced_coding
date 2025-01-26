#!/usr/bin/env bash

#!/usr/bin/env bash

function court() {
    for arg in "$@"; do
        case "$arg" in
            "G" | 'g')
                echo "The defendant is guilty."
                ;;
            "N" | 'n')
                echo "The defendant is not guilty."
                ;;
            "P" | 'p')
                echo "The trial has been postponed."
                ;;
            *)
                echo "Order Order!"
                ;;
        esac
    done
}

