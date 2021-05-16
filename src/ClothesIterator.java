
public class ClothesIterator implements Iterator {
    private Clothe[] clothes;
    private int index = 0;
    public ClothesIterator(Clothe[] clotheArray) {
        this.clothes = clotheArray;
    }

    @Override
    public boolean hasNext() {
        if(clothes.length <= index || clothes[index] == null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Clothe clothe = clothes[index++];
        return clothe;
    }
}
