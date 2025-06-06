const employees = [];

function addEmployee(name, role = "Employee", salary = 0) {
  employees.push({ name, role, _salary: salary });
}

function listEmployees() {
  console.log("👥 Employees:", employees.map(({ name, role }) => ({ name, role })));
}

function getSalary(name) {
  const emp = employees.find(e => e.name === name);
  console.log("💰 Salary:", emp ? emp._salary : "Employee not found");
}

addEmployee("Sneha", "Developer", 75000);
addEmployee("Rohan", "Manager", 95000);

listEmployees();
getSalary("Sneha");