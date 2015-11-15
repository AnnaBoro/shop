package lesson4.shop;

/**
 * Created by anna on 10.11.15.
 */
public class Shirts extends Clothes {

    private Style style;

    public Shirts(String name, Color color, int size, Gender gender, int price, Style style) {
        super(name, color, size, gender, price);
        this.style = style;
    }

    public Style getStyle() {
        return style;
    }
}
