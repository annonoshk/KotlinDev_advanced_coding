#!/usr/bin/env bash

solve() {
    # Create the directory if it's not there and handle errors
    mkdir -p /tmp/test
    cd /tmp/test || { echo "Error: Could not cd to /tmp/test"; return 1; }

    # Calculate total size in kilobytes (consistent with du -k output) - Corrected
    total_size=$(du -sk . | awk '{print $1}')

    echo "total $total_size"

    # List files, sizes, and sort.  basename is used for file names - Corrected
    find . -maxdepth 1 -type f -print0 | xargs -0 -I {} du -sk {} | sort -nr | awk '{print $1, $2}' | while read size file; do
        echo "$size $(basename "$file")" # Quote $file for safety
    done
}