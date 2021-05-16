public class Main {

    public static void main(String[] args) {
        OrderCollection orderCollection = new OrderCollection();
        ClothesCollection clothesCollection = new ClothesCollection();

        clothesCollection.addItem(new Clothe("Kerem"));
        clothesCollection.addItem(new Clothe("Kerem2"));
        clothesCollection.addItem(new Clothe("Kerem3"));
        clothesCollection.addItem(new Clothe("Kerem4"));
        clothesCollection.addItem(new Clothe("Kerem5"));

        orderCollection.addItem(new Meal(15,"Jr. Burger","WellDone"));
        orderCollection.addItem(new Meal(25,"Burger","rare"));
        orderCollection.addItem(new Meal(35,"Burger L","medium"));
        orderCollection.addItem(new Meal(45,"Burger Xl","medium"));
        orderCollection.addItem(new Meal(55,"Burger XXl","medium"));

        Iterator mealIterator = orderCollection.createIterator();
        Iterator clotheIterator = clothesCollection.createIterator();
        while (mealIterator.hasNext()){
            Meal meal = (Meal)mealIterator.next();
            System.out.println("Name: " + meal.getName()+"\nDescription: "+ meal.getDescription()+"\nPrice: "+meal.getPrice()+"\n---------");
        }

        while (clotheIterator.hasNext()){
            Clothe clothe = (Clothe)clotheIterator.next();
            System.out.println("Owner of the clothe is: "+clothe.getOwnerName());
        }

    }
}
