package aula1.test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class FIndLowerTest01 {
    public static void main(String[] args) {
        int[] list = randomArrayGenerator();
        int menor = list[0];

        int menorParcial = findLowerValue(list, menor);

        System.out.println(Arrays.toString(list));
        System.out.printf("O menor da lista é %d", menorParcial);
    }

    private static int findLowerValue(int[] list, int menor) {
        for (int j : list) {
            if (menor > j) menor = j;
        }
        return menor;
    }

    private static int[] randomArrayGenerator() {
        int[] listToReturn = new int[20];

        for (int i : listToReturn) {
            listToReturn[i] = ThreadLocalRandom.current().nextInt(0, 100);
        }
        return listToReturn;
    }
}
