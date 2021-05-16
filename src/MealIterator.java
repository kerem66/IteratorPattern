import java.util.ArrayList;

public class MealIterator implements Iterator {
    private ArrayList<Meal> meals;
    private int index = 0;
    public MealIterator(ArrayList<Meal> meals) {
        this.meals = meals;
    }

    @Override
    public boolean hasNext() {
        if(meals.size() <= index){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Meal meal = meals.get(index++);
        return meal;
    }
}
