## Login Validation Automation – Selenium Java

This project automates login functionality testing using **valid and invalid credentials** to verify authentication behavior of the application.

The framework follows a **data-driven approach**, where multiple credential combinations are read from an Excel file and validated through automated tests.

---

## Project Structure
- `dataprovider` → Test cases for login validation using multiple credentials
- `pay360` → Page classes related to login and home page
- `utils` → Utility classes for Excel data handling
- `resources` → Test data files (login credentials)

---

## Tools & Technologies
- Java  
- Selenium WebDriver  
- TestNG  
- Maven  
- Excel (Data-driven testing)

---

## Test Scenarios Covered
- Login with **valid credentials**
- Login with **invalid credentials**
- Validation of error messages for failed login
- Successful navigation for valid login

---

## Key Highlights
- Data-driven testing using Excel
- Separation of test logic and utilities
- Scalable structure for adding more authentication scenarios

---

## How to Run
1. Clone the repository  
2. Update WebDriver configuration  
3. Update test data in `TestData.xlsx`  
4. Run `mvn test`
