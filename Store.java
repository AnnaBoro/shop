package lesson4.shop;

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

        Clothes cl = new Coat();
        cl.setName("coat1");
        Category[] categories = {Category.AUTUMN_SEASON, Category.MALE_GENDER};
        cl.setCategories(categories);
        cl.setModel(1001);
        cl.setColor(Color.BLACK);
        cl.setPrice(2000);
        cl.setSize(1);
        addClothes(cl);

        cl = new Coat();
        cl.setName("coat1");
        Category[] categories1 = {Category.AUTUMN_SEASON, Category.MALE_GENDER};
        cl.setCategories(categories);
        cl.setModel(1001);
        cl.setColor(Color.BLACK);
        cl.setPrice(2000);
        cl.setSize(2);
        addClothes(cl);

        cl = new Coat();
        cl.setName("coat2");
        Category[] categories2 = {Category.MALE_GENDER, Category.WINTER_SEASON};
        cl.setCategories(categories);
        cl.setModel(1002);
        cl.setColor(Color.BLACK);
        cl.setPrice(2100);
        cl.setSize(1);
        addClothes(cl);

        cl = new Coat();
        cl.setName("coat2");
        Category[] categories3 = {Category.MALE_GENDER, Category.WINTER_SEASON};
        cl.setCategories(categories);
        cl.setModel(1002);
        cl.setColor(Color.BLUE);
        cl.setPrice(2100);
        cl.setSize(1);
        addClothes(cl);

        Clothes cl1 = new Pants();
        cl1.setName("pants1");
        Category[] categories4 = {Category.MALE_GENDER, Category.AUTUMN_SEASON};
        cl1.setCategories(categories);
        cl1.setModel(2003);
        cl1.setColor(Color.BLACK);
        cl1.setPrice(1500);
        cl1.setSize(1);
        addClothes(cl1);

        cl1 = new Pants();
        cl1.setName("pants1");
        Category[] categories5 = {Category.MALE_GENDER, Category.AUTUMN_SEASON};
        cl1.setCategories(categories);
        cl1.setModel(2003);
        cl1.setColor(Color.BLACK);
        cl1.setPrice(1500);
        cl1.setSize(2);
        addClothes(cl1);

        Clothes cl2 = new Shirt();
        cl2.setName("shirt1");
        Category[] categories6 = {Category.WOMEN_GENDER, Category.CLASSIC_FIT};
        cl2.setCategories(categories);
        cl2.setModel(3004);
        cl2.setColor(Color.RED);
        cl2.setPrice(1800);
        cl2.setSize(1);
        addClothes(cl2);

        cl2 = new Shirt();
        cl2.setName("shirt2");
        Category[] categories7 = {Category.WOMEN_GENDER, Category.CLASSIC_FIT};
        cl2.setCategories(categories);
        cl2.setModel(3004);
        cl2.setColor(Color.RED);
        cl2.setPrice(1800);
        cl2.setSize(2);
        addClothes(cl2);

        cl2 = new Shirt();
        cl2.setName("shirt2");
        Category[] categories8 = {Category.WOMEN_GENDER, Category.CLASSIC_FIT};
        cl2.setCategories(categories);
        cl2.setModel(3004);
        cl2.setColor(Color.RED);
        cl2.setPrice(1800);
        cl2.setSize(2);
        addClothes(cl2);

        cl2 = new Shirt();
        cl2.setName("shirt3");
        Category[] categories9 = {Category.WOMEN_GENDER, Category.CLASSIC_FIT, Category.SUMMER_SEASON};
        cl2.setCategories(categories);
        cl2.setModel(3005);
        cl2.setColor(Color.BLUE);
        cl2.setPrice(1850);
        cl2.setSize(1);
        addClothes(cl2);

        cl2 = new Shirt();
        cl2.setName("shirt3");
        Category[] categories10 = {Category.WOMEN_GENDER, Category.CLASSIC_FIT, Category.SUMMER_SEASON};
        cl2.setCategories(categories);
        cl2.setModel(3005);
        cl2.setColor(Color.BLUE);
        cl2.setPrice(1850);
        cl2.setSize(2);
        addClothes(cl2);

        cl2 = new Shirt();
        cl2.setName("shirt3");
        Category[] categories11 = {Category.WOMEN_GENDER, Category.CLASSIC_FIT, Category.SUMMER_SEASON};
        cl2.setCategories(categories);
        cl2.setModel(3005);
        cl2.setColor(Color.GREEN);
        cl2.setPrice(1850);
        cl2.setSize(1);
        addClothes(cl2);

        cl2 = new Shirt();
        cl2.setName("shirt3");
        Category[] categories12 = {Category.WOMEN_GENDER, Category.CLASSIC_FIT, Category.SUMMER_SEASON};
        cl2.setCategories(categories);
        cl2.setModel(3005);
        cl2.setColor(Color.GREEN);
        cl2.setPrice(1850);
        cl2.setSize(2);
        addClothes(cl2);
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
