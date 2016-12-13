package com.company;

/**
 * •	Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что первый и второй члены
 * последовательности равны единицам, а каждый следующий — сумме двух предыдущих.
 * Created by Rosh on 11.12.2016.
 */
public class Fibona44i {
    public static void main (String [] args)
    {
        int n=1, m=1, k=0;
        System.out.print(n+" "+m+" ");
        for (int i=3; i<=11; i++)
        {
         k = n+m;
         n=m;
         m=k;
         System.out.print(k+"  ");
        }

    }
}
