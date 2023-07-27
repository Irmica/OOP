package Seminar_OOP_1;

import java.util.GregorianCalendar;

public class StorageUtil {
    public static Storage creatFoodStorage() {
        Storage foodStorage = new Storage();
        Product tmpProduct;

        tmpProduct = new Food("Twix", 80, 10, new GregorianCalendar(2023, 10, 10, 0, 0), 0.2);
        foodStorage.addProduct(tmpProduct);
        tmpProduct = new Food("Mars", 90, 50, new GregorianCalendar(2023, 10, 10, 0, 0), 0.15);
        foodStorage.addProduct(tmpProduct);
        tmpProduct = new Food("Snickers", 60, 15, new GregorianCalendar(2023, 10, 0, 0, 0), 0.2);
        foodStorage.addProduct(tmpProduct);
        tmpProduct = new Food("Cookie", 1300, 10, new GregorianCalendar(2025, 10, 14, 0, 0), 0.5);
        foodStorage.addProduct(tmpProduct);
        tmpProduct = new Food("Nuts", 70, 10, new GregorianCalendar(2025, 10, 14, 0, 0), 0.1);
        foodStorage.addProduct(tmpProduct);
        return foodStorage;
    }
    // /** Наполнение напитками */
    // ArrayList<Product> beverageList = new ArrayList<>();
    // beverageList.add(new Beverage("Fanta", 82, 10, new GregorianCalendar(2024,
    // 10, 14, 0, 0), 0.5));
    // beverageList.add(new Beverage("Cola", 82, 10, new GregorianCalendar(2024,
    // 10, 14, 0, 0), 0.5));
    // beverageList.add(new Beverage("Sprite", 82, 10, new GregorianCalendar(2024,
    // 10, 14, 0, 0), 0.5));
    // beverageList.add(new Beverage("Baikal", 82, 10, new GregorianCalendar(2024,
    // 10, 14, 0, 0), 0.5));
    // beverageList.add(new Beverage("Water", 30, 10, new GregorianCalendar(2024,
    // 10, 14, 0, 0), 0.5));

    // /** Наполнение горячими напитками */
    // ArrayList<Product> hotBeverageList = new ArrayList<>();
    // hotBeverageList.add(new HotBeverage("Black Tea", 100, 20, new
    // GregorianCalendar(2023, 9, 14, 0, 0), 0.3, 95));
    // hotBeverageList.add(new HotBeverage("Green Tea", 120, 20, new
    // GregorianCalendar(2023, 9, 14, 0, 0), 0.3, 80));
    // hotBeverageList.add(new HotBeverage("White Tea", 200, 20, new
    // GregorianCalendar(2023, 9, 14, 0, 0), 0.3, 75));
    // hotBeverageList.add(new HotBeverage("Espresso", 100, 20, new
    // GregorianCalendar(2023, 9, 14, 0, 0), 0.05, 95));
    // hotBeverageList.add(new HotBeverage("Latte", 100, 20, new
    // GregorianCalendar(2023, 9, 14, 0, 0), 0.5, 85));
}
