let todos = [];

function addTask(name) {
  todos.push({ task: name, status: "pending" });
}

function completeTask(index) {
  if (todos[index]) {
    todos[index].status = "completed";
  }
}

function displayTasks() {
  todos.forEach((todo, idx) => {
    console.log(`${idx + 1}. ${todo.task} [${todo.status}]`);
  });
}

addTask("Learn JavaScript");
addTask("Build a project");
completeTask(0);
displayTasks();
