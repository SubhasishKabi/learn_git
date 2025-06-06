// Hoisting demo
console.log(companyName); // undefined
var companyName = "InnovateX";
console.log(companyName); // InnovateX

// Scope demo
let company = "TechCorp";

function employeeRole() {
  let role = "Software Engineer";
  console.log(`Company: ${company}, Role: ${role}`);
}
employeeRole();

try {
  console.log(role); // ReferenceError
} catch (e) {
  console.log("Error:", e.message); // role is not defined
}