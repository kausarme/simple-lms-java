# Library Management System:

This application is a simple Library Management System (LMS) using Java. The system allows users to manage books within
a library, enabling them to add, remove, search, and update books. It also keeps track of the books' availability status
and allows users to check out and return books. This project implemented the Singleton and Strategy design patterns,
along with the Single Responsibility and Open/Closed SOLID principles.

## Design patterns:

- **The Singleton design pattern** is used in the LibraryManagementSystem class to ensure that only one instance of the
  Library Management System is created throughout the application's lifetime. This guarantees that all users interact
  with the same instance, ensuring data consistency and preventing any possible conflicts.
- **The Strategy design pattern** is used to manage different search algorithms for finding books in the library. This
  allows for easily extending the application with new search strategies without modifying the existing code, adhering
  to the Open/Closed principle.


## SOLID Principles:

- **The Single Responsibility principle** is used in the application to ensure that each class has a single
  responsibility. This increase the code scalability and make it easier and more flexible to modify in the future.
- **The Open/Closed principle** is used in the application to allow the extension of functionalities without modifying
  existing code. For instance, the application can easily add new search algorithms for finding books by implementing a
  new strategy without changing the existing search functionalities. This makes the code more flexible and easier to
  modify in the future.

"# simple-lms-java" 
