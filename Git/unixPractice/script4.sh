#!/bin/bash

validate_presence() {
  if [[ "$1" != "p" && "$1" != "P" && "$1" != "a" && "$1" != "A" ]]; then
    echo "Invalid input. Please enter P (Present) or A (Absent)."
    return 1
  fi
  return 0
}

categorize_attendance() {
  case "$1" in
    [Pp]) echo "Status: Present" ;;
    [Aa]) echo "Status: Absent" ;;
  esac
}

process_student() {
  read -p "Enter student name: " name

  while true; do
    read -p "Is $name present (P) or absent (A)? " status
    validate_presence "$status"
    if [[ $? -eq 0 ]]; then
      break
    fi
  done

  echo "Student: $name"
  categorize_attendance "$status"
  echo "-----------------------------"
}

while true; do
  process_student
  read -p "Do you want to enter another student? (Y/N): " choice
  if [[ "$choice" != "Y" && "$choice" != "y" ]]; then
    echo "Attendance tracking finished."
    break
  fi
done
