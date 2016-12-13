package com.company;

/**•	Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5].
 * Вывести массив на экран. Определить и вывести на экран индекс строки с наибольшим по модулю произведением элементов.
 * Если таких строк несколько, то вывести индекс первой встретившейся из них.
 * Created by Rosh on 11.12.2016.
 */
public class Mas2 {
    public static void main (String []args){
        int mas [][]= new int[7][4];
        int p1=1;
        int pMax=0;
        int iMax=0;
        for (int i = 0; i<mas.length; i++){
            for (int j=0; j<mas[i].length; j++){
                mas[i][j] = (int)(Math.random()*(-6)+6);
            }
        }
        for (int i=0; i<mas.length; i++){
            for (int j=0; j<mas[i].length; j++){
                System.out.print(mas[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i<mas.length; i++){
            for (int j=0; j<mas[i].length; j++){
            p1=p1*mas[i][j];
            }
            if (Math.abs(p1)>Math.abs(pMax)){
                iMax=i;
                pMax=p1;
            }
            System.out.println(i+" "+p1);
            p1=1;
        }
        System.out.println();
        System.out.println("Index stroki s naibol'shim proizvedeniem po modulu: "+iMax);
    }
}
