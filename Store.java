package lesson4.shop;

import java.util.Date;

/**
 * Created by anna on 12.11.15.
 */
public class Store {

    private Clothes[] clothes = new Clothes[20];
    private Buyer[] buyers = new Buyer[20];
    private Purchase[] purchases = new Purchase[20];

    private int EXIST_CLOTHES = 0;
    private int EXIST_BUYERS = 0;
    private int EXIST_PURCHASE = 0;

    public Store() {

        initStore();
    }

    public void sold (Clothes cl, int num, Buyer b, int dateYMD) {

        for (int i = 0; i < clothes.length; i++) {
            if (cl != null && clothes[i] != null && clothes[i].equals(cl) && clothes[i].isSold() == false) {
                clothes[i].setSold(true);
                addBuyer(b);
                addPurchase(new Purchase(cl, b, dateYMD, num));
            }
        }
    }

    public void addClothes(Clothes cl) {

        clothes[EXIST_CLOTHES] = cl;
        EXIST_CLOTHES++;

        if (EXIST_CLOTHES >= clothes.length * 0.8) {
            increaseStoreVolume();
        }
    }

    public void addBuyer(Buyer b) {

        buyers[EXIST_BUYERS] = b;
        EXIST_BUYERS++;

        if (EXIST_BUYERS >= buyers.length * 0.8) {
            increaseBuyerVolume();
        }
    }

    public void addPurchase(Purchase p) {

        purchases[EXIST_PURCHASE] = p;
        EXIST_PURCHASE++;

        if (EXIST_PURCHASE >= purchases.length * 0.8) {
            increasePurchaseVolume();
        }
    }

    public Buyer createBuyer(String name, String email, int phoneNumber) {

        return new Buyer(name, email, phoneNumber);
    }

    public void initStore() {

        Clothes c1 = new Coats("cool O-shaped coat", Color.BROWN, 6, Gender.WOMEN, 500, Season.AUTUMN_SPRING);
        addClothes(c1);
        c1 = new Coats("cool O-shaped coat", Color.BROWN, 8, Gender.WOMEN, 500, Season.AUTUMN_SPRING);
        addClothes(c1);
        c1 = new Coats("cool O-shaped coat", Color.BROWN, 10, Gender.WOMEN, 500, Season.AUTUMN_SPRING);
        addClothes(c1);
        c1 = new Coats("cool O-shaped coat", Color.BROWN, 12, Gender.WOMEN, 500, Season.AUTUMN_SPRING);
        addClothes(c1);
        c1 = new Coats("cool O-shaped coat", Color.BROWN, 14, Gender.WOMEN, 500, Season.AUTUMN_SPRING);
        addClothes(c1);
        c1 = new Coats("cool O-shaped coat", Color.BROWN, 16, Gender.WOMEN, 500, Season.AUTUMN_SPRING);
        addClothes(c1);
        c1 = new Coats("marled bouclé knitted coat", Color.GREEN, 6, Gender.WOMEN, 600, Season.SUMMER);
        addClothes(c1);
        c1 = new Coats("marled bouclé knitted coat", Color.GREEN, 8, Gender.WOMEN, 600, Season.SUMMER);
        addClothes(c1);
        c1 = new Coats("marled bouclé knitted coat", Color.GREEN, 10, Gender.WOMEN, 600, Season.SUMMER);
        addClothes(c1);
        c1 = new Coats("marled bouclé knitted coat", Color.GREEN, 12, Gender.WOMEN, 600, Season.SUMMER);
        addClothes(c1);
        c1 = new Coats("marled bouclé knitted coat", Color.GREEN, 14, Gender.WOMEN, 600, Season.SUMMER);
        addClothes(c1);
        c1 = new Coats("marled bouclé knitted coat", Color.GREEN, 16, Gender.WOMEN, 600, Season.SUMMER);
        addClothes(c1);
        c1 = new Pants("stretch business trousers", Color.GREY, 30, Gender.MEN, 660, Fit.BOOTCUT);
        addClothes(c1);
        c1 = new Pants("stretch business trousers", Color.GREY, 32, Gender.MEN, 660, Fit.BOOTCUT);
        addClothes(c1);
        c1 = new Pants("stretch business trousers", Color.GREY, 34, Gender.MEN, 660, Fit.BOOTCUT);
        addClothes(c1);
        c1 = new Pants("stretch business trousers", Color.GREY, 36, Gender.MEN, 660, Fit.BOOTCUT);
        addClothes(c1);
        c1 = new Pants("stretch business trousers", Color.GREY, 38, Gender.MEN, 660, Fit.BOOTCUT);
        addClothes(c1);
        c1 = new Pants("cotton chinos + belt", Color.PURPLE, 6, Gender.WOMEN, 650, Fit.CHINOS);
        addClothes(c1);
        c1 = new Pants("cotton chinos + belt", Color.PURPLE, 8, Gender.WOMEN, 650, Fit.CHINOS);
        addClothes(c1);
        c1 = new Pants("cotton chinos + belt", Color.PURPLE, 10, Gender.WOMEN, 650, Fit.CHINOS);
        addClothes(c1);
        c1 = new Pants("cotton chinos + belt", Color.PURPLE, 12, Gender.WOMEN, 650, Fit.CHINOS);
        addClothes(c1);
        c1 = new Pants("cotton chinos + belt", Color.PURPLE, 14, Gender.WOMEN, 650, Fit.CHINOS);
        addClothes(c1);
        c1 = new Pants("cotton chinos + belt", Color.PURPLE, 16, Gender.WOMEN, 650, Fit.CHINOS);
        addClothes(c1);
        c1 = new Shirts("flowing printed blouse", Color.WHITE, 6, Gender.WOMEN, 450, Style.CASUAL);
        addClothes(c1);
        c1 = new Shirts("flowing printed blouse", Color.WHITE, 8, Gender.WOMEN, 450, Style.CASUAL);
        addClothes(c1);
        c1 = new Shirts("flowing printed blouse", Color.WHITE, 10, Gender.WOMEN, 450, Style.CASUAL);
        addClothes(c1);
        c1 = new Shirts("flowing printed blouse", Color.WHITE, 12, Gender.WOMEN, 450, Style.CASUAL);
        addClothes(c1);
        c1 = new Shirts("flowing printed blouse", Color.WHITE, 14, Gender.WOMEN, 450, Style.CASUAL);
        addClothes(c1);
        c1 = new Shirts("flowing printed blouse", Color.WHITE, 16, Gender.WOMEN, 450, Style.CASUAL);
        addClothes(c1);
    }

    public void increaseStoreVolume() {

        Clothes[] clothes1 = new Clothes[clothes.length * 2];
        System.arraycopy(clothes, 0, clothes1, 0, clothes.length);
        clothes = clothes1;
    }

    public void increaseBuyerVolume() {

        Buyer[] buyers1 = new Buyer[buyers.length * 2];
        System.arraycopy(buyers, 0, buyers1, 0, buyers.length);
        buyers = buyers1;
    }

    public void increasePurchaseVolume() {

        Purchase[] purchases1 = new Purchase[purchases.length * 2];
        System.arraycopy(purchases, 0, purchases, 0, purchases.length);
        purchases = purchases1;
    }



    public Clothes[] getClothes() {
        return clothes;
    }

    public Buyer[] getBuyers() {
        return buyers;
    }

    public Purchase[] getPurchases() {
        return purchases;
    }

    public int getExistClothes() {
        return EXIST_CLOTHES;
    }

    public int getExistBuyers() {
        return EXIST_BUYERS;
    }

    public int getExistPurchase() {
        return EXIST_PURCHASE;
    }
}
