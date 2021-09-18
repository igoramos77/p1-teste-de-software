package p1;

public class Product {
    private Category category;
    private Integer quantity;

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
}
