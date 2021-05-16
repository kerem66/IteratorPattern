import java.util.ArrayList;

public class OrderCollection implements Collection {
    ArrayList<Meal> meals;
    static final int MAX_ORDER = 10;

    public OrderCollection() {
        meals = new ArrayList<>();
    }

    public void addItem(Meal meal)
    {
        if(meals.size() >= MAX_ORDER){
            System.out.println("Order is Full");
        }else{
            meals.add(meal);
        }

    }

    @Override
    public Iterator createIterator() {
        return new MealIterator(meals);
    }

    public ArrayList<Meal> getMeals() {
        return meals;
    }

    public void setMeals(ArrayList<Meal> meals) {
        this.meals = meals;
    }
}
