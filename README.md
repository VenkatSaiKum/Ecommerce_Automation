# Ecommerce_Automation
Automated UI Testing for Ecommerce Website This project automates the functional testing of the Automation Exercise website using Selenium WebDriver with Cucumber (BDD) and TestNG. It implements a Page Object Model (POM) Hybrid Framework, framework supports cross-browser testing (Chrome, Firefox, Edge) and data-driven testing using Apache POI.
# 🚀 Capstone Project: Ecommerce Website Test Automation

## 📚 Overview
This project automates the functional UI testing of the [Automation Exercise Website](https://www.automationexercise.com/).  
It validates key functionalities like **User Registration**, **Login**, **Product Search**, **Cart Operations**, **Checkout**, **Contact Form**, and **Subscription** using a robust automation framework based on:
- Selenium WebDriver
- Cucumber (BDD)
- TestNG
- Maven
- Page Object Model (POM)
- Apache POI (for Data-Driven Testing)
- Jenkins & GitHub Actions (for CI/CD)
- Extent Reports & Allure Reports (for Reporting)

---

## 🎯 Project Objectives
- Develop a maintainable hybrid framework using POM + BDD
- Automate major ecommerce functionalities
- Implement cross-browser testing (Chrome, Firefox, Edge)
- Integrate with Jenkins for CI/CD pipelines
- Capture detailed reports and screenshots for failed tests
- Implement Data-Driven Testing using external Excel sheets

---

## 🛠️ Technology Stack
| Tool/Technology | Purpose |
| :--- | :--- |
| Selenium WebDriver | Web Automation |
| Cucumber | BDD Framework |
| TestNG | Test Execution Management |
| Maven | Build Management |
| Apache POI | Data-Driven Testing (Excel) |
| Jenkins | CI/CD Integration |
| Git | Version Control |
| ExtentReports / AllureReports | Test Reporting |
| ChromeDriver / GeckoDriver / EdgeDriver | Cross Browser Testing |

---

## 🧩 Project Structure
CapEcomm/ │ ├── src/test/java/ │ ├── Features/ # Cucumber feature files │ ├── pages/ # Page Object Classes │ ├── StepDefinitions/ # Step Definitions for features │ ├── TestRunner/ # Test Runner (TestNG Integration) │ ├── src/test/resources/ # Test data (Excel, Properties) │ ├── pom.xml # Maven Project File └── README.md # Project Documentation


## ✨ Major Functionalities Automated
- New User Registration
- Valid and Invalid Login
- Product Search and Verification
- Add to Cart / Remove from Cart
- Checkout and Order Placement
- Contact Us Form Submission (Valid/Invalid)
- Newsletter Subscription (Valid/Invalid)

## 🚦 How to Run the Project Locally

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/CapEcomm.git
   
2. Navigate into the project directory:
   ```bash
   cd CapEcomm

4. Install Maven dependencies:
   ```bash
   mvn clean install
   
5. To execute the tests using TestNG:
   ```bash
   mvn test

