#!/usr/bin/env bash solve() { # add your solution here }

#!/usr/bin/env bash
solve() {
    # Navigate to the /tmp/test directory
    cd /tmp/test

    # Calculate the total size of files
    total_size=$(du -ch | grep total | awk '{print $1}')

    # Display the total size
    echo "total $total_size"

    # List files sorted by size in descending order
    ls -lS | awk '{ if (NR!=1) {print $5, $9}}'
}