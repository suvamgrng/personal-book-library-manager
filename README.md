# Personal Book Library Manager

A simple REST API I built while learning Spring Boot.
It lets you manage a book collection — add, update, delete, and search books.
Data is stored in memory (no database).

## Tech Stack
- Java 21
- Spring Boot 3
- Maven

## How to Run
1. Clone this repository
2. Open in IntelliJ IDEA
3. Run `PersonalBookLibraryManagerApplication.java`
4. API runs at `http://localhost:8080`

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /api/books | Get all books |
| GET | /api/books/{id} | Get a book by ID |
| POST | /api/books | Add a new book |
| PUT | /api/books/{id} | Update a book |
| DELETE | /api/books/{id} | Delete a book |
| GET | /api/books/search?author= | Search by author |
| GET | /api/books/search?genre= | Search by genre |

## Author
Suvam Gurung