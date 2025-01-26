#!/usr/bin/env bash

answers=("a" "d" "c" "a" "a")
total_score=0

for (( i = 0; i < 5; i++));
do
    case "${1}" in

        ${answers[i]})
            ((total_score++))
            ;;
        "-"|"--")
            ;;
        *)
            ((total_score--))
            ;;

    esac
    shift 1
done

echo "Total score is: $total_score"