let officeSupplies = [];

function addSupply(item) {
  officeSupplies.push(item);
  console.log("📦 Added:", item);
  console.log("Current Supplies:", officeSupplies);
}

function removeSupply(item) {
  officeSupplies = officeSupplies.filter(i => i !== item);
  console.log("❌ Removed:", item);
  console.log("Current Supplies:", officeSupplies);
}

addSupply("Pens");
addSupply("Notebooks");
removeSupply("Pens");