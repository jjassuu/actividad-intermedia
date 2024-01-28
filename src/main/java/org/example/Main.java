package org.example;
public class Main {
    public static void main(String[] args) {
        int count = 10;
        int[] fibonacciSeries = generateFibonacciSeries(count);
        System.out.print("Serie de Fibonacci: ");
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacciSeries[i]);
            if (i < count - 1) {
                System.out.print(", ");
            }
        }
    }

    public static int[] generateFibonacciSeries(int count) {
        int[] series = new int[count];
        if (count >= 1) {
            series[0] = 0;
        }
        if (count >= 2) {
            series[1] = 1;
        }
        for (int i = 2; i < count; i++) {
            series[i] = series[i - 1] + series[i - 2];
        }
        return series;
    }
}