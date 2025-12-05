# 📝 Automation Test Plan – NopCommerce Demo Store

## 1. Introduction
This document outlines the automation test plan for the **NopCommerce Demo Store**.  
The purpose is to define the testing scope, objectives, strategy, environment, risks, and deliverables for the automation mini-project.

---

## 2. Project Overview
- **Application Under Test (AUT):** https://demo.nopcommerce.com/
- **Domain:** E-commerce web application
- **Automation Framework:** Selenium WebDriver + TestNG + Java + Maven
- **Design Pattern:** Page Object Model (POM)

---

## 3. Objectives
The objectives of the automation project are:

- Validate core functionalities of the NopCommerce website.
- Build a scalable and maintainable automation framework.
- Improve regression testing speed and accuracy.
- Demonstrate automation skills for learning/portfolio purposes.

---

## 4. Scope of Automation

### **In Scope**
- User registration  
- User login / logout  
- Product search  
- Product filtering & sorting  
- Add to cart  
- Add to wishlist  
- Product detail verification  
- Checkout flow (guest and logged-in users)  
- UI validations (titles, labels, error messages)

### **Out of Scope**
- Performance testing  
- Security testing  
- Backend database validation  
- Third-party integrations

---

## 5. Test Approach

### **Automation Type**
- UI automation testing  
- Regression testing  
- Smoke testing  
- Data-driven testing (where applicable)

### **Framework Overview**
- **TestNG** for test orchestration  
- **Selenium WebDriver** for UI interactions  
- **POM** for page maintainability  
- **Extent Reports** for reporting  
- **Log4j2** for logging  
- **Maven** for dependency management  

---

## 6. Test Environment

### **Environment Details**
| Component | Description |
|----------|-------------|
| URL | https://demo.nopcommerce.com/ |
| Browser | Chrome / Firefox |
| OS | Windows / macOS |
| Test Data | Stored in `/src/main/resources/testdata/` |

---

## 7. Tools & Technologies
- **Java 17+**
- **Selenium WebDriver**
- **TestNG**
- **Maven**
- **WebDriverManager**
- **Extent Reports**
- **Log4j2**
- **GitHub**

---

## 8. Risks & Mitigation

| Risk | Impact | Mitigation |
|------|--------|------------|
| Demo site performance issues | High | Retry logic, waits |
| Unstable locators | Medium | Use robust locator strategy |
| UI changes on demo site | Medium | Modular POM structure |
| Network delays | Low | Increase timeout & retry |

---

## 9. Test Deliverables
- Automation framework source code  
- Test cases in Markdown  
- Test execution reports  
- Logs & screenshots  
- README documentation  

---

## 10. Exit Criteria
Automation is considered complete when:
- All high-priority test cases are automated  
- Framework is stable and maintainable  
- Reports are generated successfully  
- No critical automation defects remain  

---

## 11. References
- NopCommerce demo site  
- Selenium official docs  
- TestNG documentation  
