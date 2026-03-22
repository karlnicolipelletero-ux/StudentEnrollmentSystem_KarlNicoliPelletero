Student Enrollment System
A Java Swing and MySQL application for student and course management.

Project Structure
src/: Java source code (MainDashboard, EnrollmentListSystem, etc.).

lib/: Database libraries (MySQL Connector).

database/: SQL setup script and ERD diagram.

nbproject/: Project configuration files.

Database Setup
Open MySQL Workbench.

Go to File > Open SQL Script and select database_setup.sql.

Execute the script to create the schema and tables.

Verify that DBConnection.java matches your local MySQL username and password.

How to Run
Via NetBeans
Open the project folder in NetBeans.

Select Run > Clean and Build Project.

Press F6 to run.

Via JAR File
Open the dist/ folder.

Ensure the lib/ folder is in the same directory.

Run EnrollmentSystem.jar.

Database Relationships
Student to Enrollment: One-to-Many. One student can have multiple enrollment entries.

Course to Enrollment: One-to-Many. One course can be assigned to multiple students.
