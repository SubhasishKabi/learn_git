#!/bin/bash

print_even() {
    echo "even"
}

run_counter_loop() {
    counter=0
    while [ $counter -lt 5 ]; do
        echo "Count: $counter"
        ((counter++))
    done
}

say_hello_world() {
    echo "Hello, world!"
}

greet_user() {
    name=$1
    echo "Hello, $name!"
}

add_numbers() {
    echo $(($1 + $2))
}

show_sum() {
    sum=$(add_numbers 5 7)
    echo "Sum = $sum"
}

print_even
run_counter_loop
say_hello_world
greet_user "Sravya"
show_sum
