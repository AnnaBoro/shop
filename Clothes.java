package lesson4.shop;

/**
 * Created by anna on 10.11.15.
 */
public class Clothes {

    private String name;
    private Color color;
    private int size;
    private int price;
    private Gender gender;
    private boolean sold = false;

    public Clothes(String name, Color color, int size, Gender gender, int price) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.gender = gender;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Gender getGender() {
        return gender;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }
}
