package com.company;

import java.util.Scanner;

/**•	Создайте код, который выводит все простые числа из интервала от 2 до n (заданного с клавиатуры).
 * Результат должен быть: 2,3,5,7 ...
 * Created by Rosh on 12.12.2016.
 * не работает пока что(((
 */
public class SimpleNum {

    int num(int i) {
        int result = 1;

        for (int k = 2; k < i; k++) {
            if ((i % 2 == 0) && (i/i == 0)) {
                result++;
                break;
            }
        }
        //if (result == 1)
            System.out.print(i + "\t");
        if (i > 2)
        return num(i+1);
    }

    public static void main(String[] args) {
        SimpleNum rec = new SimpleNum();
        System.out.println("Vvedite celoe 4islo n:");
        Scanner sc = new Scanner(System.in);
        int uNum = sc.nextInt();
        System.out.println("" + rec.num(uNum));
    }
}