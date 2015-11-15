package lesson4.shop;

/**
 * Created by anna on 10.11.15.
 */
public class Coats extends Clothes {

    private Season season;

    public Coats(String name, Color color, int size, Gender gender, int price, Season season) {
        super(name, color, size, gender, price);
        this.season = season;
    }

    public Season getSeason() {
        return season;
    }
}
