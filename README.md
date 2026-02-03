# FileRenamer
Java SWING Desktop Application
Author: Seungho Jeong
Project Date: December 22, 2026

Project Description
A lightweight Java Swing desktop application for batch renaming files with customizable rules and a real-time preview.
Overview
Renaming many files manually is slow and error-prone. FileRenamer simplifies the process by allowing users to apply flexible renaming rules and preview changes before executing them.
This project was built to demonstrate Java GUI development, object-oriented design, and safe file system operations.

Features
Batch rename multiple files or entire folders
Add prefixes and suffixes
Auto-numbering with configurable start index
Find & replace text in filenames
Real-time preview of original → renamed files
Conflict detection to prevent overwriting files
Simple and intuitive Swing-based GUI

Tech Stack
Language: Java
UI Framework: Java Swing
File Handling: java.io, java.nio.file
Architecture: MVC-style separation of UI and logic

Getting Started

Prerequisites
Java JDK 8 or higher
Any Java IDE (IntelliJ IDEA, Eclipse, VS Code)

Installation
git clone https://github.com/your-username/filerenamer.git
cd filerenamer

Run the Application
javac Main.java
java Main
(Adjust file names if your entry point differs)

Usage
Select a folder or multiple files
Choose rename rules (prefix, suffix, numbering, etc.)
Review the preview panel
Click Rename to apply changes

Project Structure
src/
 ├── ui/          # Swing UI components
 ├── logic/       # Rename rules and validation
 ├── file/        # File system operations
 └── Main.java    # Application entry point
 
Error Handling
Prevents duplicate filenames
Detects invalid characters
Handles locked or read-only files gracefully
Ensures all-or-nothing rename execution

Future Improvements
Regex-based renaming
Undo / rollback support
Drag-and-drop file selection
Save and load rename presets
Dark mode UI

Learning Outcomes
Java Swing UI development
Event-driven programming
File system manipulation in Java
Modular, maintainable code design
Defensive programming for real-world utilities

License
This project is for educational purposes.
