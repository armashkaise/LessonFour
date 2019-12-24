import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyArrayList implements List{
    private String[] values;
    private int size;
    private static int INITIAL_CAPACITY = 10;
    private static int INCREASE_ON_RATE = 2;

    public MyArrayList() {
        this(INITIAL_CAPACITY);
    }

    private MyArrayList(int capacity){
        this.values = new String[capacity];
    }

    @Override
    public String get(int index){
        boolean checkIfIndexIbBoundaries = index >= 0 && index < size;
        if (!checkIfIndexIbBoundaries) return "Значение индекса не соответствует диапазону";
        return values[index];
    }

    @Override
    public int size(){
        return size;
    }

    @Override
    public void add(String value){
        if (value == null)
            return;

        if (size == values.length) {
           increaseStorageValues();
        }

        values[size] = value;
        size++;
    }

    private void increaseStorageValues() {
        String[] newArray = new String[values.length * INCREASE_ON_RATE];
        System.arraycopy(values, 0, newArray, 0, values.length);
        values = newArray;
    }
}
