package lesson4.shop;

import java.util.Arrays;

/**
 * Created by anna on 13.11.15.
 */
public class Report {

    Store store;

    public Report(Store store) {
        this.store = store;
    }

    public String[] getPrice () {

        String[] price = new String[store.getExistClothes()];
        Clothes[] cl = store.getClothes();

        for (int i = 0; i < cl.length; i++) {
            if (cl[i] != null) {
//                if (!containValue(price, cl[i].getName().toString() + " " + cl[i].getPrice())) {
                    price[i] = cl[i].getName().toString() + " " + cl[i].getPrice();
//                }
            }
        }

        return price;
    }

    public String[] getClothesOnStock () {

        String[] clothesOnStock = new String[3];
        int coatsOnStock = 0;
        int pantsOnStock = 0;
        int shirtsOnStock = 0;
        for (int i = 0; i < store.getExistClothes(); i++) {
            if (store.getClothes()[i] instanceof Coats) {
                coatsOnStock++;
            }
            else if (store.getClothes()[i] instanceof Pants) {
                pantsOnStock++;
            }
            else if (store.getClothes()[i] instanceof Shirts) {
                shirtsOnStock++;
            }
        }
        clothesOnStock[0] = "Coats: " + coatsOnStock;
        clothesOnStock[1] = "Pants: " + pantsOnStock;
        clothesOnStock[2] = "Shirts: " + shirtsOnStock;

        return clothesOnStock;
    }

    public int[] getPurchasesInLast7Days() {

        int [] purchasesIn7Day = new int[7];
        Purchase[] purchases = store.getPurchases();
        int today = 20151115;
        for (int j = today, k = 0; j > 20151107 && k < 7; j--, k++) {
            for (int i = 0; i < purchases.length; i++) {
                if (purchases[i] != null && purchases[i].getDate() == j) {
                    purchasesIn7Day[k] += purchases[i].getClothes().getPrice() * purchases[i].getNumber();
                }
            }
        }
        return purchasesIn7Day;
    }

    public void printListTodayPurchases() {

        Purchase[] purchases = store.getPurchases();
        int today = 20151115;
        int numPurchase = 0;
        int todayProfit = 0;
        int numSoldClothes = 0;

        System.out.println("№     Buyer     Clothes     Price     Number");
        for (int i = 0; i < purchases.length; i ++) {
            if (purchases[i] != null && purchases[i].getDate() == today) {
                numPurchase++;
                System.out.println(numPurchase + "  " + purchases[i].getBuyer().getName() + "  " + purchases[i].getClothes().getName()
                                + "  " + purchases[i].getClothes().getPrice() + "  " + purchases[i].getNumber());
                numSoldClothes += purchases[i].getNumber();
                todayProfit += purchases[i].getNumber() * purchases[i].getClothes().getPrice();
            }
        }
        System.out.println("In total " + numPurchase + " purchases    " + todayProfit + "   " + numSoldClothes);
    }

    public void printCatalogByCategory() {

        String[] catalog = new String[store.getExistClothes()];
        Clothes[] cl = store.getClothes();

        for (int i = 0, j = 0; i < cl.length && j < store.getExistClothes(); i++, j++) {
            if (cl[i] != null) {
                if (cl[i] instanceof Coats) {
                    catalog[j] = cl[i].getGender().toString() + " " + ((Coats)cl[i]).getSeason().toString() + " "
                            + cl[i].getName() + " " + cl[i].getColor().toString();
                }
                else if (cl[i] instanceof Pants) {
                    catalog[j] = cl[i].getGender().toString() + " " + ((Pants)cl[i]).getFit().toString() + " "
                            + cl[i].getName() + " " + cl[i].getColor().toString();
                }
                else if (cl[i] instanceof Shirts) {
                    catalog[j] = cl[i].getGender().toString() + " " + ((Shirts)cl[i]).getStyle().toString() + " "
                            + cl[i].getName() + " " + cl[i].getColor().toString();
                }
            }
        }
        for (int i = 0; i < catalog.length; i++) {
            System.out.println(catalog[i]);
        }
    }

    public boolean containValue(String[] arr, String value) {

        for (String key : arr) {
            if (key != null && key.equalsIgnoreCase(value)) {
                return true;
            }
        }
        return false;
    }

    public Store getStore() {
        return store;
    }
}
