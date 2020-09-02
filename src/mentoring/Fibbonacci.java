package mentoring;

import java.util.ArrayList;
import java.util.List;

public class Fibbonacci {
    public static void main(String[] args) {

    }


    //easiest


    //1st way
    public static int fibonacciNumber(int n) {
        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci[fibonacci.length - 1];

    }

    //2nd way
    public static Integer getNthFibonacci(int n){
        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);
        for (int i = 2; i < n ; i++){
            fibonacci.add(fibonacci.get(i-2)+fibonacci.get(i-1));
        }
        return fibonacci.get(n-1);
    }


    //3rd way
    public static int fibonacci(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
