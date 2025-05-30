echo "Hello Unix"

echo -n "Enter first number"
read num1
echo -n "Enter second number"
read num2

sum=$((num1+ num2))
diff=$((num1-num2))
prod=$((num1*num2))
echo "$sum , $diff, $prod"
