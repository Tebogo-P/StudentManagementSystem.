Here is the plain text version. I have removed all bold text and special formatting so you can just copy and paste it.

ADP372S Mini Assignment 1

Student Name: Tebogo Pii
Student Number: 240674774

Project Overview
This is my submission for the mini assignment. I built a Student Management System in Java that handles different student types marked Undergraduate and Graduate. I used the Builder Pattern to handle the optional fields and Inheritance to share common attributes.

The system calculates tuition differently for each type:

Undergraduate: Pays per credit hour.

Graduate: Pays a base fee minus a stipend.

SOLID Principles Applied

Single Responsibility Principle (SRP)
I used this by separating the object creation from the student class. The Student class only holds data and calculates tuition. I moved all the complex creation logic into a static createStudent() inner class. This ensures each class has only one job.

Open/Closed Principle (OCP)
I used this so I can add new features without breaking old code. I created an abstract Student class. If we need a Honors Student later perhaps, I can just extend Student in a new file. I don't need to change the existing Student or Undergraduate code to make it work.

GitHub Repository
[Paste your link here]
