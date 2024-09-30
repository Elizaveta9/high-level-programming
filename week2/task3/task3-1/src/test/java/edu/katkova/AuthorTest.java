package edu.katkova;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AuthorTest {

    @Test
    void testToString() {
        Author author = new Author("", 0);
        String expectedStr = "Автор:  (0 года рождения)";
        assertEquals(expectedStr, author.toString());
    }
}