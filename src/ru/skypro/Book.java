package ru.skypro;

import java.util.Objects;

public class Book {
    private String name;
    private int publicationYear;
    private Author author;

    public Book(String name, int publicationYear, Author author) {
        this.name = name;
        this.publicationYear = publicationYear;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public Author getAuthor() {
        return author;
    }
    public void setPublicationYear(int publicationYear){
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Название книги - " + name + ". Год публикации - " + publicationYear + ". Автор - " + author;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (other == null || getClass() != other.getClass())
            return false;
        Book book = (Book) other;
        return publicationYear == book.publicationYear && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, publicationYear, author);
    }
}
