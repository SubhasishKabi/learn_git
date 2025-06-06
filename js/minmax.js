function findMinMax(arr) {
  let smallest = arr[0];
  let largest = arr[0];

  for (let num of arr) {
    if (num < smallest) smallest = num;
    if (num > largest) largest = num;
  }

  console.log("Largest:", largest);
  console.log("Smallest:", smallest);
}

findMinMax([7, 2, 10, 4, 8]);
