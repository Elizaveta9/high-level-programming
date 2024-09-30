package edu.katkova;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookTest {

    @Test
    void testToString() {
        Book book = new Book(new Author("", 0), "");
        String expectedStr = "Книга \"\", Автор:  (0 года рождения)";
        assertEquals(expectedStr, book.toString());
    }
}