package Seminar_OOP_1;


import java.util.GregorianCalendar;
import java.util.List;

public class Storage {
    public static List<Product> foodList;
    public List<Product> beverageList;
    public List<Product> hotBeverageList;

    
    public Storage() {
        // this.foodList = foodList;
        // this.beverageList = beverageList;
        // this.hotBeverageList = hotBeverageList;

        /** Наполнение едой */
        Product product1 = new Food("Twix", 80, 10, new GregorianCalendar(2023, 10, 10, 0, 0), 0.2);
        Product product2 = new Food("Mars", 90, 50, new GregorianCalendar(2023, 10, 10, 0, 0), 0.15);
        Product product3 = new Food("Snickers", 60, 15, new GregorianCalendar(2023, 10, 0, 0, 0), 0.2);
        Product product4 = new Food("Cookie", 1300, 10, new GregorianCalendar(2025, 10, 14, 0, 0), 0.5);
        Product product5 = new Food("Nuts", 70, 10, new GregorianCalendar(2025, 10, 14, 0, 0), 0.1);
        foodList.add(product1);
        foodList.add(product2);
        foodList.add(product3);
        foodList.add(product4);
        foodList.add(product5);

        /** Наполнение напитками */
        Product product6 = new Beverage("Fanta", 82, 10, new GregorianCalendar(2024, 10, 14, 0, 0), 0.5);
        Product product7 = new Beverage("Cola", 82, 10, new GregorianCalendar(2024, 10, 14, 0, 0), 0.5);
        Product product8 = new Beverage("Sprite", 82, 10, new GregorianCalendar(2024, 10, 14, 0, 0), 0.5);
        Product product9 = new Beverage("Baikal", 82, 10, new GregorianCalendar(2024, 10, 14, 0, 0), 0.5);
        Product product10 = new Beverage("Water", 30, 10, new GregorianCalendar(2024, 10, 14, 0, 0), 0.5);
        beverageList.add(0, product6);

        // /** Наполнение горячими напитками */
        // Product product11 = new HotBeverage("Black Tea", 100, 20, new GregorianCalendar(2023, 9, 14, 0, 0), 0.3, 95);
        // Product product12 = new HotBeverage("Green Tea", 120, 20, new GregorianCalendar(2023, 9, 14, 0, 0), 0.3, 80);
        // Product product13 = new HotBeverage("White Tea", 200, 20, new GregorianCalendar(2023, 9, 14, 0, 0), 0.3, 75);
        // Product product14 = new HotBeverage("Espresso", 100, 20, new GregorianCalendar(2023, 9, 14, 0, 0), 0.05, 95);
        // Product product15 = new HotBeverage("Latte", 100, 20, new GregorianCalendar(2023, 9, 14, 0, 0), 0.5, 85);
        // hotBeverageList = createFoodList(product11, product12, product13, product14, product15);
    }

    public static List<Product> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Product> foodList) {
        Storage.foodList = foodList;
    }

    public List<Product> getBeverageList() {
        return beverageList;
    }

    public void setBeverageList(List<Product> beverageList) {
        this.beverageList = beverageList;
    }

    public List<Product> getHotBeverageList() {
        return hotBeverageList;
    }

    public void setHotBeverageList(List<Product> hotBeverageList) {
        this.hotBeverageList = hotBeverageList;
    }
   

}
