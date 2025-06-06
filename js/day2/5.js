function setPreferences(language = "English", theme = "Light", notifications = true) {
  return { language, theme, notifications };
}

console.log(setPreferences());