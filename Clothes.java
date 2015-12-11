package lesson4.shop;


public class Clothes {

    private String name;
    private int model;
    private Color color;
    private int size;
    private int price;
    private Category[] categories;
    private boolean sold = false;

    public Clothes() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }

    public void changePrice(int price) {
        this.price = price;
    }

    public void setCategories(Category[] categories) {
        this.categories = categories;
    }

    public Category[] getCategories() {
        return categories;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }
}
