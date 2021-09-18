package p1;

import org.junit.jupiter.api.Test;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    @Test
    void handleNameIsNull() {
        Category category = new Category();
        category.setName("Eletronicos");

        assertEquals("Eletronicos", category.getName());
    }

    @Test
    void handleCategoryNameMook() {
        Category category = createMock(Category.class);
        expect(category.getName()).andReturn("Notebooks");
        replay(category);

        assertEquals("Notebooks", category.getName());
    }
}