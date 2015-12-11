package lesson4.shop;

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
                if (!containValue(price, cl[i].getName() + " " + cl[i].getPrice())) {
                price[i] = cl[i].getName() + " " + cl[i].getPrice();
                }
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
            if (store.getClothes()[i] instanceof Coat) {
                coatsOnStock++;
            }
            else if (store.getClothes()[i] instanceof Pants) {
                pantsOnStock++;
            }
            else if (store.getClothes()[i] instanceof Shirt) {
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
                    purchasesIn7Day[k] +=  purchases[i].getNumber();
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

        System.out.println("__________Today Purchases:");
        System.out.println("№  Buyer  Clothes  Model  Price  Number");
        for (int i = 0; i < purchases.length; i ++) {
            if (purchases[i] != null && purchases[i].getDate() == today) {
                numPurchase++;
                System.out.println(numPurchase + "  " + purchases[i].getBuyer().getName() + "  " +
                        purchases[i].getClothes().getName() + " " + purchases[i].getClothes().getModel() + "  " +
                        purchases[i].getClothes().getPrice() + "  " + purchases[i].getNumber());
                numSoldClothes += purchases[i].getNumber();
                todayProfit += purchases[i].getNumber() * purchases[i].getClothes().getPrice();
            }
        }
        System.out.println("In total " + numPurchase + " purchases    " + todayProfit + "   " + numSoldClothes);
    }

    public void printCatalogByCategory(Category category) {

        String[] catalog = new String[20];
        Clothes[] cl = store.getClothes();

        System.out.println("__________Catalog by Category: " + category.toString());

        for (int i = 0; i < cl.length; i++) {
            if (cl[i] != null) {
                for (int j = 0, k = 0; j < cl[i].getCategories().length; j++) {
                    if (cl[i].getCategories()[j].equals(category) &&
                            !containValue(catalog, cl[i].getName() + " " + cl[i].getModel() + " " + cl[i].getColor() +
                             " " + cl[i].getPrice())) {

                        catalog[k] = cl[i].getName() + " " + cl[i].getModel() + " " + cl[i].getColor() +
                                " " + cl[i].getPrice();
                        System.out.println(catalog[k]);
                        k++;
                    }
                }

            }
        }
    }

    public boolean containValue(String[] arr, String value) {

        for (String key : arr) {
            if (key != null && key.equals(value)) {
                return true;
            }
        }
        return false;
    }

    public Store getStore() {
        return store;
    }
}
