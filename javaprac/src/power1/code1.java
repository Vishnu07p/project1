package power1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class code1 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        while (true) {
            int[] result = subtractAbsoluteValues(array);
            if (Arrays.equals(array, result)) {
                break;
            }
            array = result;
        }

        System.out.println("Array with distinct values: " + Arrays.toString(array));
    }

    public static int[] subtractAbsoluteValues(int[] array) {
        Set<Integer> distinctValues = new HashSet<>();
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < array.length; i += 2) {
            int num1 = array[i];
            int num2 = (i + 1 < array.length) ? array[i + 1] : 0;
            int result = Math.abs(num1 - num2);

            if (!distinctValues.contains(result)) {
                distinctValues.add(result);
            }

            resultList.add(result);
        }

        int[] resultArray = new int[distinctValues.size()];
        int index = 0;
        for (int value : distinctValues) {
            resultArray[index++] = value;
        }

        return resultArray;
    }
}