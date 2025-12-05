# 🧩 Coding Guidelines for Automation Framework

This document defines the coding conventions and best practices used in this automation project.  
Following these guidelines ensures **clean**, **maintainable**, **scalable**, and **consistent** test automation code.

---

# 1. General Principles

### ✔ Write Clean & Readable Code
- Code should be easy for any QA engineer to read and understand.
- Avoid overly complex logic inside test scripts.

### ✔ Follow Consistent Naming Conventions
- Use clear, descriptive names for classes, variables, and methods.
- Avoid abbreviations unless they are widely understood.

### ✔ Keep Code DRY (Don’t Repeat Yourself)
- Reuse common utilities and helper methods.
- Extract duplicated logic into reusable functions.

### ✔ Commit Small, Atomic Changes
- Each commit should represent one meaningful change.
- Use descriptive commit messages.

---

# 2. Naming Conventions

### ✔ Project Structure
| Component | Naming Example | Format |
|----------|----------------|--------|
| **Package** | `com.project.framework.pages` | all lowercase |
| **Class** | `LoginPage`, `CartTests` | PascalCase |
| **Method** | `loginAsUser()`, `addToCart()` | camelCase |
| **Variable** | `userName`, `productPrice` | camelCase |
| **Constants** | `DEFAULT_TIMEOUT`, `BASE_URL` | UPPER_SNAKE_CASE |
| **Test Files** | `LoginTest`, `CheckoutFlowTest` | PascalCase |

---

# 3. Test Writing Guidelines

### ✔ Test Methods Should Be:
- Short  
- Focused on one scenario  
- Easy to understand  

### ✔ Each Test Must Have:
- Clear test steps  
- A predictable outcome  
- Assertions validating behavior  

### Example:
```java
@Test
public void testValidLogin() {
    loginPage.open();
    loginPage.login("user@example.com", "password123");

    Assert.assertTrue(dashboardPage.isDisplayed(), "Dashboard should be displayed after login.");
}
