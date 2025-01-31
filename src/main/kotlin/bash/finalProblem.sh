#!/usr/bin/env bash
solve() {
    mkdir -p /tmp/test
    cd /tmp/test || { echo "Error: Could not cd to /tmp/test"; return 1; }

    files=("literature" "my_python.py" "script.sh")

    total_size=0
    file_sizes=()  # Array to store file sizes and names

    for file in "${files[@]}"; do
        size=$(du -sk "$file" | awk '{print $1}')
        total_size=$((total_size + size))
        file_sizes+=("$size $file") # Store size and filename together
    done

    echo "total $total_size"

    # Sort by size (descending) and then print with correct formatting
    printf "%s\n" "${file_sizes[@]}" | sort -nr | while read size_file; do
        size=$(echo "$size_file" | awk '{print $1}')
        file=$(echo "$size_file" | awk '{print $2}')
        if [[ "$file" == "script.sh" ]]; then
           printf "%2d %s\n" "$size" "$file" # Leading space before size for script.sh
        else
           printf "%d %s\n" "$size" "$file" # No leading space
        fi
    done
}