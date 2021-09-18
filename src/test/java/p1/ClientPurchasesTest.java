package p1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClientPurchasesTest {

    @Test
    void handleProductList() {
        Address address = new Address("Rua Maria Estela Moura", 40, null, "Centro", "Mendes", "RJ");
        PhysicalPerson physicalPerson = new PhysicalPerson("igorbrownramos@gmail.com", "123", "avatar.jpg", address, "Igor", "Brown Ramos", "15443385704", "M", new Date(1994-2-26));
        Product product1 = new Product();
        Category category = new Category();
        category.setName("Placas de Vídeo");
        product1.setName("Placa de video RTX 2080");
        product1.setCategory(category);

        Product product2 = new Product();
        product2.setName("Placa de video GTX 750 TI");
        product2.setCategory(category);

        List<Product> productList = Arrays.asList(product1, product2);

        ClientPurchases clientPurchases = new ClientPurchases();
        clientPurchases.setClient(physicalPerson);
        clientPurchases.setProductListPurchases(productList);

        assertEquals(productList, clientPurchases.getProductListPurchases());
    }
}