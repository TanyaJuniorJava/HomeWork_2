package com.company;

import java.util.Scanner;

/**•	Написать метод, который для данного числа n (заданного с клавиатуры) вычисляет сумму чисел от 1 до n;
 * Created by Rosh on 12.12.2016.
 */
public class Recursion1 {

    int sum(int i) {
        int result;

        if (i == 1)
            return 1;
        result = sum(i - 1) + i;
        return result;
    }

    public static void main (String[] args){
        Recursion1 rec = new Recursion1();
        System.out.println("Vvedite celoe 4islo n:");
        Scanner sc = new Scanner(System.in);
        int un = sc.nextInt();
        System.out.println("Summa 4isel ot 1 do n: " + rec.sum(un));
    }

    }
