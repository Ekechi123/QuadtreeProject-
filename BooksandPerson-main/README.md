# Programming Language Homework 3

This project implements a basic library management system using object-oriented principles in Java. It includes functionality for managing books and people, including library members and staff.

## Classes:

- **Book**: An abstract base class representing general book attributes, with two subclasses:
  - **Fiction**: Represents fictional books.
  - **NonFiction**: Represents non-fiction books.

- **Person**: An abstract base class for people in the library, with two subclasses:
  - **Member**: Represents a library member who can borrow books.
  - **Staff**: Represents library staff, with added responsibilities like registering books and members.

- **Library**: A class that manages the collection of books, members, and staff, facilitating the operations of the library system.

## How to Run:

1. Clone the repository to your local machine:
   ```bash
   git clone https://github.com/Ekechi123/BooksandPerson-main.git

2. Navigate to the project directory:
cd BooksandPerson-main

3. Compile the Java files:
javac *.java

4. Run the Main class:
java Main