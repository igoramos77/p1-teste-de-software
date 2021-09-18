package p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    @Test
    void handleNameIsNull() {
        Category category = new Category();
        category.setName("Eletronicos");

        assertEquals("Eletronicos", category.getName());
    }
}