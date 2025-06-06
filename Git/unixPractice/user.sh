#!/bin/bash

# Sample users (username:password:role)
# In a real system, this would be stored securely
users=("admin:admin123:Admin" "guest:guest123:Guest" "john:john123:Member")

# Function to check credentials
check_credentials() {
    local uname=$1
    local pwd=$2
    for user in "${users[@]}"; do
        IFS=':' read -r u p role <<< "$user"
        if [[ "$uname" == "$u" && "$pwd" == "$p" ]]; then
            echo "$role"
            return 0
        fi
    done
    return 1
}

# Function to handle login process
login() {
    attempts=0
    max_attempts=3

    while (( attempts < max_attempts )); do
        echo -n "Enter username: "
        read uname
        echo -n "Enter password: "
        read -s pwd
        echo

        role=$(check_credentials "$uname" "$pwd")
        if [[ $? -eq 0 ]]; then
            echo "Login successful!"
            case "$role" in
                Admin)
                    echo "Welcome, Admin! You have full access."
                    ;;
                Guest)
                    echo "Welcome, Guest! You have limited access."
                    ;;
                Member)
                    echo "Welcome, Member! You have standard access."
                    ;;
                *)
                    echo "Unknown role."
                    ;;
            esac
            return
        else
            ((attempts++))
            echo "Invalid credentials. Attempts left: $((max_attempts - attempts))"
        fi
    done

    echo "Too many failed attempts. Access denied."
}

# Start login process
login
