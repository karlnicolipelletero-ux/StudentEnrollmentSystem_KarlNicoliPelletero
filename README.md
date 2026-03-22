# Student Enrollment System

Java Swing application for student registration and course enrollment with MySQL.

## Project Structure

* **src/**: Java source files.
* **lib/**: MySQL JDBC Driver.
* **database/**: SQL setup script and ERD.
* **nbproject/**: NetBeans configuration.

---

## Database Setup

1. Open **MySQL Workbench**.
2. Run `database_setup.sql` from the `database/` folder.
3. Ensure `DBConnection.java` credentials match your local MySQL settings.

---

## How to Run

### Via NetBeans
1. Open the project in NetBeans.
2. Select **Run > Clean and Build Project**.
3. Press **F6** to run.

### Via JAR File
1. Open the **dist/** folder.
2. Keep the **lib/** folder in the same directory as the `.jar`.
3. Launch `EnrollmentSystem.jar`.

---

## Relationships

* **Student to Enrollment**: One-to-Many.
* **Course to Enrollment**: One-to-Many.
