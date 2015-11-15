package lesson4.shop;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by anna on 12.11.15.
 */
public class Launcher {

    public static void main(String[] args) {

        Store store = new Store();
        Report report = new Report(store);
        String[] getPriceList = report.getPrice();
        for (int i = 0; i < getPriceList.length; i++) {
            System.out.println((getPriceList[i]));
        }

        String[] getClothesOnStockList = report.getClothesOnStock();
        for (int i = 0; i < getClothesOnStockList.length; i++) {
            System.out.println(getClothesOnStockList[i]);
        }

        store.sold(store.getClothes()[2], 1, new Buyer("Anna", "aa@gmail.com", 0667540345), 20151115);
        store.sold(store.getClothes()[5], 2, new Buyer("Paul", "pp@gmail.com", 0665550345), 20151115);
        store.sold(store.getClothes()[7], 1, new Buyer("Greta", "hh@gmail.com", 0664343445), 20151115);
        report.printListTodayPurchases();

        store.sold(store.getClothes()[0], 1, new Buyer("Dean", "aaw@gmail.com", 0667740345), 20151114);
        store.sold(store.getClothes()[0], 1, new Buyer("Dean", "aaw@gmail.com", 0667740345), 20151113);
        store.sold(store.getClothes()[0], 1, new Buyer("Dean", "aaw@gmail.com", 0667740345), 20151112);
        store.sold(store.getClothes()[0], 1, new Buyer("Dean", "aaw@gmail.com", 0667740345), 20151111);
        store.sold(store.getClothes()[0], 1, new Buyer("Dean", "aaw@gmail.com", 0667740345), 20151110);
        store.sold(store.getClothes()[0], 1, new Buyer("Dean", "aaw@gmail.com", 0667740345), 20151109);
        System.out.println(Arrays.toString(report.getPurchasesInLast7Days()));
        report.printCatalogByCategory();
    }
}
