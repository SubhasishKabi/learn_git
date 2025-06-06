function createEmployeeProfile(name, jobTitle = "Software Engineer") {
  return { name, jobTitle };
}

console.log(createEmployeeProfile("Alice"));