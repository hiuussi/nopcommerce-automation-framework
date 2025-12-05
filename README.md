# 📘 Automation Testing Mini Project – NopCommerce Demo Store
## 🛒 Overview

This project is an end-to-end UI automation testing framework built for the demo e-commerce website:
https://demo.nopcommerce.com/

The purpose of this mini project is to practice and demonstrate skills in Test Automation, including:

1. Designing a scalable automation framework

2. Applying Page Object Model (POM)

3. Writing maintainable automated test cases

4. Using best practices for coding, version control, and documentation

5. Covering essential manual testing skills with supporting documents

6. This repository contains both automation testing code and manual QA artifacts such as Test Plan, Test Cases, and reference documents.

## 🚀 Tech Stack
### Programming Language

Java (primary language)

### Automation Tools & Frameworks

Selenium WebDriver

TestNG

Maven

ExtentReports (HTML report)

Log4j2 (logging)

WebDriver Manager (driver handling)

### Design Pattern

Page Object Model (POM)

Reusable utilities

Config-driven framework

### Version Control

Git & GitHub

## 📂 Project Structure
```
automation-nopcommerce/
│
├── docs/
│   ├── TestPlan_Template.md
│   ├── TestCase_Template.md
│   ├── ManualSkills_Checklist.md
│   └── Ecommerce_Test_Scenarios.md
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── base/
│   │   │   ├── pages/
│   │   │   ├── utils/
│   │   │   └── config/
│   │   └── resources/
│   │       ├── config.properties
│   │       └── testdata/
│   │
│   └── test/
│       ├── java/
│       │   ├── testcases/
│       │   └── runners/
│
├── reports/
│
├── .gitignore
├── pom.xml
└── README.md
```

## 🧪 Test Coverage
### Core Scenarios Implemented

User registration

Login / Logout

Product search & filtering

Add to cart / wishlist

Product details validation

Checkout flow (guest & registered user)

Navigation & UI validation

Error validation tests

### Additional Optional Scenarios

Data-driven tests

Cross-browser execution

Parallel test execution

Negative test cases

Boundary testing of forms

## 📑 Documentation Included
docs/ folder contains:

### 1. Test Plan Template

Scope

Strategy

Entry/Exit Criteria

Risks & assumptions

### 2. Test Case Template

Pre-conditions

Steps / Data

Expected / Actual behavior

### 3. Manual Testing Checklist

Functional testing

UI/UX testing

Browser compatibility

Exploratory testing

Regression checklist

### 4. E-commerce Test Scenarios

User flows

Checkout

Search

Product interactions

Negative cases

## ⚙️ Prerequisites

Java 17+

Maven 3.8+

IntelliJ IDEA / VS Code / Eclipse

Chrome / Firefox browsers

### Install dependencies:

mvn clean install

## ▶️ How to Run Tests
### Run all tests:
mvn test


### Run a specific test class:

mvn -Dtest=LoginTests test

## 📊 Reports

After execution, HTML reports will be generated under:

/reports/


### Reports include:

Test execution status

Screenshots on failure

Logs

Environment info

## 🤝 Contributing

This is a personal learning project, but contributions or suggestions are welcome!
Feel free to create issues or submit pull requests.
