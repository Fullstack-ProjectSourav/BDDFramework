# Selenium Cucumber BDD Automation Framework

## Overview

This project is a Behavior Driven Development (BDD) automation framework built using:

* Java
* Selenium WebDriver
* Cucumber
* TestNG
* Maven
* WebDriverManager

The framework automates web application testing using Gherkin feature files and Cucumber step definitions.

---

## Project Structure

```text
BDDFramework
│
├── src/test/java
│   ├── StepDefinitions
│   │   └── StepDefinition.java
│   │
│   └── TestRunner
│       └── TestRunner.java
│
├── src/test/resources
│   └── Features
│       └── demo.feature
│
├── target
│
├── pom.xml
└── README.md
```

---

## Technologies Used

| Technology         | Version |
| ------------------ | ------- |
| Java               | 8+      |
| Selenium WebDriver | Latest  |
| Cucumber           | 7.x     |
| TestNG             | 7.x     |
| Maven              | 3.x     |
| WebDriverManager   | Latest  |

---

## Test Scenario

### OrangeHRM Login

1. Launch OrangeHRM application
2. Enter valid username
3. Enter valid password
4. Click Login button
5. Verify user navigates to Dashboard
6. Close browser

---

## Feature File Example

```gherkin
Feature: Test the Login Functionality of OrangeHRM Application

Scenario: Successful login with valid credentials
  Given User is on Login
  When User enters valid username and password
  And clicks on Login Button
  Then User is navigated to Home Page
  And Close the browser
```

---

## Running the Tests

### Run Using Maven

```bash
mvn clean test
```

### Run Using Test Runner

Execute the TestRunner class as:

```text
Run As -> TestNG Test
```

---

## Reports

After execution, reports are generated in:

```text
target/cucumber.html
```

Open the report in a browser to view execution results.

---

## Maven Dependencies

* Selenium Java
* Cucumber Java
* Cucumber TestNG
* TestNG
* WebDriverManager

Dependencies are managed through the pom.xml file.

---

## Author

Sourav Nayak

QA Automation Engineer

Skills:

* Selenium WebDriver
* Java
* TestNG
* Cucumber BDD
* Maven
* Git & GitHub
* API Testing
* SQL
* Jenkins
