package com.company;

/**•	Подсчитайте, сколько раз потребуется повторно вычислить четвёртый элемент последовательности
 *  Фибоначчи для вычисления пятнадцатого элемента.
 *  /гуглила и не до конца поняла, что делается в задаче
 * Created by Rosh on 11.12.2016.
 */
public class Fibo2 {
    static long fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 2) + fib(n - 1);
    }

    static long fibo(int n) {
        if (n < 47) {
            long z = fib(n);
            return z;
        } else {
            long n1 = 1, n2 = 1, s = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    s = n1 + n2;
                    n1 = s;
                } else {
                    s = n1 + n2;
                    n2 = s;
                }
            }
            return s;
        }
    }

    public static void main(String[] args) {
        int f = 15;
        long d = fibo(f);
        f = 4;
        long d1 = fibo(f);
        int k = (int) (d / d1);
        System.out.println("Potrebuetsya " + k + " raz");
    }
}