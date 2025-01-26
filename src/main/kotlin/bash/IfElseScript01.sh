#!/usr/bin/env bash

if [[ "${1}" == "" ]]; then
	echo "No option was selected."

elif [[ "${1}" == "1" ]]; then
	echo "You selected '1'."

elif [[ "${1}" == "2" ]]; then
	echo "You selected '2'."

elif [[ "${1}" == "3" ]]; then
	echo "You selected '3'."

else
	echo "Unknown number '${1}'."

fi

