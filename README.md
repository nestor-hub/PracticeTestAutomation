This project automates key UI scenarios from (https://practicetestautomation.com/practice/), a site designed to help QA engineers practice real-world testing.  
It includes both login functionality testing and exception handling tests using Selenium WebDriver, Java, and TestNG,following the Page Object Model (POM).

Technology used
- Language: Java  
- Automation Tool: Selenium WebDriver  
- Test Framework: TestNG  
- Design Pattern: Page Object Model (POM)  
- Dependency Manager: Maven  
- Driver Management: WebDriverManager

 
✅ Test Coverage
  
 🔐 Login Tests
- ✔️ Valid Login → Username: `student`, Password: `Password123`
- ❌ Invalid Login (wrong username)
- ❌ Invalid Login (wrong password)


Each test validates:
- URL redirect on success
- Displayed confirmation message
- Presence of the logout button
