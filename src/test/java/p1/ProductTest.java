package p1;

import org.junit.jupiter.api.Test;


import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    @Test
    void handleLowInventory() {
        Category category = new Category();
        category.setName("Placas de Vídeo");

        Product product = new Product();
        product.setCategory(category);
        product.setQuantity(5); // test in conditional limit

        assertEquals(true, product.getLowInventory());
    }

    @Test
    void handleHighInventory() {
        Category category = new Category();
        category.setName("Notebooks");

        Product product = new Product();
        product.setCategory(category);
        product.setQuantity(6); // test in conditional limit

        assertEquals(false, product.getLowInventory());
    }

    @Test
    void handleGetProductNameMook() {
        Product product = createMock(Product.class);
        expect(product.getName()).andReturn("Placa de Vídeo GTX 1080 TI");
        replay(product);

        assertEquals("Placa de Vídeo GTX 1080 TI", product.getName());
    }
}