package lesson4.shop;

import java.util.Arrays;

public class Launcher {

    public static void main(String[] args) {

        Store store = new Store();
        Report report = new Report(store);

        String[] getPriceList = report.getPrice();
        System.out.println("__________Clothes Pricelist:");
        for (int i = 0; i < getPriceList.length; i++) {
            if (getPriceList[i] != null) {
                System.out.println((getPriceList[i]));
            }
        }

        String[] getClothesOnStockList = report.getClothesOnStock();
        System.out.println("__________Clothes on Stock:");
        for (int i = 0; i < getClothesOnStockList.length; i++) {
            System.out.println(getClothesOnStockList[i]);
        }

        report.printCatalogByCategory(Category.MALE_GENDER);
        report.printCatalogByCategory(Category.CASUAL_FIT);

        Buyer buyer1 = store.createBuyer("Susie", "susie@gmail.com", 3809743);
        store.sold(store.getClothes()[2], 1, buyer1, 20151115);
        Buyer buyer2 = store.createBuyer("Sam", "sam@gmail.com", 3809743);
        store.sold(store.getClothes()[4], 1, buyer2, 20151115);
        Buyer buyer3 = store.createBuyer("Samuel", "samuel@gmail.com", 3809743);
        store.sold(store.getClothes()[7], 1, buyer3, 20151115);

        report.printListTodayPurchases();

        store.sold(store.getClothes()[0], 1, new Buyer("Dean", "aaw@gmail.com", 0667740345), 20151114);
        store.sold(store.getClothes()[1], 1, new Buyer("Dean", "aaw@gmail.com", 0667740345), 20151113);
        store.sold(store.getClothes()[3], 1, new Buyer("Dean", "aaw@gmail.com", 0667740345), 20151112);
        store.sold(store.getClothes()[5], 1, new Buyer("Dean", "aaw@gmail.com", 0667740345), 20151111);
        store.sold(store.getClothes()[8], 1, new Buyer("Dean", "aaw@gmail.com", 0667740345), 20151110);
        store.sold(store.getClothes()[9], 1, new Buyer("Dean", "aaw@gmail.com", 0667740345), 20151109);
        store.sold(store.getClothes()[11], 1, new Buyer("Dean", "aaw@gmail.com", 0667740345), 20151109);

        System.out.println("__________Last 7 Days Purchases:");
        System.out.println(Arrays.toString(report.getPurchasesInLast7Days()));
    }
}
