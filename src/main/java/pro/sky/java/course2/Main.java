package pro.sky.java.course2;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int SIZE_ARRAY = 100_000;
        Integer[] arrTest = new Integer[SIZE_ARRAY];
        Random random = new Random();
        for (int i = 0; i < SIZE_ARRAY; i++) {
            arrTest[i] = random.nextInt(1, 100000);
        }
        System.out.println("Размер массива  = "+SIZE_ARRAY);
        long start = System.currentTimeMillis();
        IntegerListImpl.sortBubble(arrTest);
        long finish = System.currentTimeMillis();
        System.out.println("Пузырьковая сортировка (мс) = " +
                (finish - start));


        start = System.currentTimeMillis();
        IntegerListImpl.sortSelection(arrTest);
        finish = System.currentTimeMillis();
        System.out.println("Сортировка выбором (мс) = " +
                (finish - start));

        start = System.currentTimeMillis();
        IntegerListImpl.sortInsertion(arrTest);
        finish = System.currentTimeMillis();
        System.out.println("Сортировка вставкой (мс) = " +
                (finish - start));

    }
}
