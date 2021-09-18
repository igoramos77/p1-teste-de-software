package p1;

public class Product {
    private String name;
    private Category category;
    private Integer quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public boolean getLowInventory() {
        if(quantity <= 5) {
            return true;
        }
        else {
            return false;
        }
    }

    public String getProducts() {
        if(this.getName() == null) {
            return "Product not found";
        }

        return this.getName();
    }
}
