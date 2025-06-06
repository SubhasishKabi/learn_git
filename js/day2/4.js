function generateEmail(name, department, date) {
  return `Dear ${name},\n\nWelcome to the ${department} team! Your joining date is ${date}.`;
}

console.log(generateEmail("Bob", "Engineering", "2025-07-01"));