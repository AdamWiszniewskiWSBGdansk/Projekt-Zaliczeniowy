document.addEventListener("DOMContentLoaded", function() {
    fetchBooks();
});

function fetchBooks() {
    console.log("DZIAŁAM KURWA")
    fetch('http://localhost:8080/books')
        .then(response => response.json())
        .then(data => {
            const booksList = document.getElementById('books-list');

            data.forEach(book => {
                const bookElement = document.createElement('div');
                bookElement.innerHTML = `
                    <h2>${book.title}</h2>
                    <p>Author: ${book.author}</p>
                    <p>Description: ${book.description}</p>
                    <p>ISBN: ${book.isbn}</p>
                    <p>Rating: ${book.rating}</p>
                    <p>Number of Volumes: ${book.num_of_vol}</p>
                    <hr>
                `;
                booksList.appendChild(bookElement);
            });
        })
        .catch(error => console.error('Error fetching books:', error));
}
