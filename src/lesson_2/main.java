package lesson_2;

import java.util.Arrays;

class Main
{
    public static void sort(int[] array)
    {
        // считаем колличесвто каждого эллимента
        int[] buckets = new int[array.length + 1];
        for (int element : array)
        {
            buckets[element - 1]++;
        }
        System.out.println(Arrays.toString(buckets));
        // сортируем
        int arrayIndex = 0;
        for (int i = 0; i < buckets.length; i++)
        {
            for (int j = buckets[i]; j > 0; j--)
            {
                array[arrayIndex++] = i + 1;
            }
        }
    }

    public static void main(String[] args)
    {
        int[] arr = { 4, 2, 10, 10, 2, 4, 2, 2, 10 };

        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

