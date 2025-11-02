# Student Management System 

## Overview
This project is a simple **Student Management System** developed using **Object-Oriented Programming (OOP)** concepts in Java.  
It demonstrates **inheritance, polymorphism, abstract classes, interfaces, method overloading, and overriding**.


## Class Structure

### 1. `Person` (Abstract Class)
- **Fields:** `name`, `email`
- **Methods:** `displayInfo()` (abstract)

### 2. `Student` (Extends Person)
- **Fields:** `rollNo`, `course`, `marks`, `grade`
- **Methods:** 
  - `displayInfo()` (overridden)
  - `displayInfo(String message)` (overloaded)

### 3. `RecordActions` (Interface)
- **Methods:**
  - `addStudent(Student s)`
  - `deleteStudent(int rollNo)`
  - `updateStudent(int rollNo, Student newStudent)`
  - `searchStudent(int rollNo)`
  - `viewAllStudents()`

### 4. `StudentManager` (Implements RecordActions)
- Implements all CRUD operations using a `HashMap<Integer, Student>`.


## Features
- Add, delete, update, search, and view student records.
- Prevents duplicate roll numbers.
- Demonstrates method overriding and overloading.
- Organized into modular packages:
  - `model` → for `Person` and `Student`
  - `service` → for `RecordActions` and `StudentManager`


## Technologies
- **Language:** Java  
- **Collections Used:** `HashMap`, `ArrayList`  
- **Concepts:** Inheritance, Interfaces, Abstract Classes, Polymorphism


## How to Run
```bash
javac model/*.java service/*.java Main.java
java Main
```

## Output Screenshot
<img width="510" height="797" alt="Screenshot 2025-11-02 114858" src="https://github.com/user-attachments/assets/009cf974-1a6b-4cbe-a797-df87c566ecc9" />


## Author
- Nikita Saharan
- B.Sc (H) Data Science
- Java Programming Lab Assignment - 2
