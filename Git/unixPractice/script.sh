#!/bin/bash
echo "Hello, Unix!"
name="Subhasish"
greeting="Hello, $name! Welcome to Bash scripting."

echo "$greeting"

a=10
b=5


sum=$((a + b))
diff=$((a - b))
prod=$((a * b))
quot=$((a / b))

echo "Addition: $sum"
echo "Subtraction: $diff"
echo "Multiplication: $prod"


echo "Division: $quot"

echo "Enter your age:"
read age

if [ $age -ge 18 ]; then  
    echo "Adult"  
elif [ $age -ge 13 ]; then
    echo "Teenager"
else  
    echo "Minor"  
fi

echo "Enter a number between 1 and 7:"
read day

case $day in
    1)
        echo "Sunday"
        ;;
    2)
        echo "Monday"
        ;;
    3)
        echo "Tuesday"
        ;;
    4)
        echo "Wednesday"
        ;;
    5)
        echo "Thursday"
        ;;
    6)
        echo "Friday"
        ;;
    7)
        echo "Saturday"
        ;;
    *)
        echo "Invalid input! Enter a number from 1 to 7."
        ;;
esac
