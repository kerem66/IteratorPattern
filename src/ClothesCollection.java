public class ClothesCollection implements Collection {
    private Clothe[] clothes;
    int numberOfGuests = 0;
    static final int MAX_GUEST = 10;

    public ClothesCollection() {
        this.clothes = new Clothe[MAX_GUEST];
    }

    public void addItem(Clothe clothe)
    {
        if(numberOfGuests >= MAX_GUEST){
            System.out.println("Restaurant is full. We can't get anymore guests. Please visit anytime soon.");
        }else{
            clothes[numberOfGuests++] = clothe;
        }

    }

    @Override
    public Iterator createIterator() {
        return new ClothesIterator(clothes);
    }
}
