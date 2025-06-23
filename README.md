# 🏢 Organization Management System

A Spring Boot application that manages a hierarchical structure of organizations, sub-organizations, departments, roles, and employees — with validation and safe deletion rules.

---

## 📁 Features

- ✅ Create, read, update, delete (CRUD) for:
    - Organizations
    - Sub-Organizations
    - Departments
    - Roles
    - Employees
- ✅ Input validation using Jakarta Bean Validation
- ✅ Prevents deletion of parent entities if children exist (e.g., role with employees)
- ✅ Uses PostgreSQL as the database
- ✅ RESTful API endpoints (tested with Postman)

---

## 🚀 Tech Stack

| Layer      | Technology            |
|------------|------------------------|
| Backend    | Spring Boot 3.5        |
| Language   | Java 21                |
| ORM        | Spring Data JPA        |
| DB         | PostgreSQL             |
| Validation | Jakarta Validation API |
| Build Tool | Maven                  |
| Testing    | Postman                |
| IDE        | IntelliJ / Eclipse     |

---

## 🧱 Entity Relationships

Organization
 └── SubOrganization
  └── Department
   └── Role
    └── Employee


---

git clone https://kaustubhkh24.github.io/org-mgmt-system/
cd org-mgmt-system
mvn clean install



