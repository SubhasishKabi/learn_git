function calculate(a, b, operation) {
  let result;

  switch (operation) {
    case '+':
      result = a + b;
      break;
    case '-':
      result = a - b;
      break;
    case '*':
      result = a * b;
      break;
    case '/':
      result = b !== 0 ? a / b : "Cannot divide by 0";
      break;
    default:
      result = "Invalid operation";
  }

  return result;
}

console.log(calculate(10, 5, '+')); 
console.log(calculate(10, 0, '/')); 