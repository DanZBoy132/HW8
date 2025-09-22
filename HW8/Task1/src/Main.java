import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] array2 = {34223, 4234, 432, 423, 234, 745, 2342, 123, 436534, 12431};

        System.out.println("Исходный массив: " + Arrays.toString(array2));

        List<Integer> list = Arrays.asList(array2);
        Collections.reverse(list);

        System.out.println("Развернутый массив: " + Arrays.toString(array2));
    }
}
