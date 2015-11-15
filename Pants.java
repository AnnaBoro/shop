package lesson4.shop;

/**
 * Created by anna on 10.11.15.
 */
public class Pants extends Clothes{

    private Fit fit;

    public Pants(String name, Color color, int size, Gender gender, int price, Fit fit) {
        super(name, color, size, gender, price);
        this.fit = fit;
    }

    public Fit getFit() {
        return fit;
    }
}
