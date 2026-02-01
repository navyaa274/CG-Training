package Feb1;
import java.util.*;

public class ListRotate {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println("Original: " + list);
        rotateList(list, 2);
        System.out.println("Rotated by 2: " + list);
    }

    public static <T> void rotateList(List<T> list, int positions) {
        int size = list.size();
        positions = positions % size;
        if (positions < 0) positions += size;

        List<T> rotated = new ArrayList<>();
        for (int i = positions; i < size; i++) {
            rotated.add(list.get(i));
        }
        for (int i = 0; i < positions; i++) {
            rotated.add(list.get(i));
        }
        list.clear();
        list.addAll(rotated);
    }
}