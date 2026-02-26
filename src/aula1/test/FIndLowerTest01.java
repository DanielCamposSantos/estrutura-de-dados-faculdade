package aula1.test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class FIndLowerTest01 {
    public static void main(String[] args) {
        int[] list = randomArrayGenerator();
        int possivelMenorValor = list[0];

        int menorValorDaLista = findLowerValue(list, possivelMenorValor);

        System.out.println(Arrays.toString(list));
        System.out.printf("O possivelMenorValor da lista é %d", menorValorDaLista);
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
