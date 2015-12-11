package lesson4.shop;


public class Purchase {

    private Clothes clothes;
    private Buyer buyer;
    private int date;
    private int number;

    public Purchase(Clothes clothes, Buyer buyer, int date, int number) {
        this.clothes = clothes;
        this.buyer = buyer;
        this.date = date;
        this.number = number;
    }

    public Clothes getClothes() {
        return clothes;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
