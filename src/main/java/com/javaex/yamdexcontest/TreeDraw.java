package com.javaex.yamdexcontest;


import java.util.Arrays;
import java.util.Scanner;

public class TreeDraw {
//    Имя входного файла: stdin
//    Имя выходного файла: stdout
//    Ограничение по времени: 1 секунда
//    Ограничение по памяти: 256 мегабайт
//    Вася и Маша участвуют в субботнике и красят стволы деревьев в белый цвет. Деревья растут
//    вдоль улицы через равные промежутки в 1 метр. Одно из деревьев обозначено числом ноль, деревья
//    по одну сторону занумерованы положительными числами 1, 2 и т.д., а в другую — отрицательными
//-1, -2 и т.д.
//    Ведро с краской для Васи установили возле дерева P, а для Маши — возле дерева Q. Ведра
//    с краской очень тяжелые и Вася с Машей не могут их переставить, поэтому они окунают кисть в
//    ведро и уже с этой кистью идут красить дерево. Краска на кисти из ведра Васи засыхает, когда он
//    удаляется от ведра более чем на V метров, а из ведра Маши — на M метров. Определите, сколько
//    деревьев может быть покрашено.
//    Формат входных данных
//    В первой строке содержится два целых числа P и V — номер дерева, у которого стоит ведро
//    Васи и на сколько деревьев он может от него удаляться.
//    В второй строке содержится два целых числа Q и M — аналогичные данные для Маши.
//    Все числа целые и по модулю не превосходят 108
//            .
//    Формат выходных данных
//    Выведите одно число — количество деревьев, которые могут быть покрашены.
//    Ввод          Вывод
//    0 7           25
//    12 5

//    public static int numTreePaint(String vasya, String masha){
//        int tree=0;
//        String[] partsVasya=vasya.split(" ");
//        String[] partsMasha=masha.split(" ");
//        int P=Integer.parseInt(partsVasya[0]);
//        int V=Integer.parseInt(partsVasya[1]);
//        int Q=Integer.parseInt(partsMasha[0]);
//        int M=Integer.parseInt(partsMasha[1]);
//        int minv=P-V;
//        int maxv=P+V;
//        int minm=Q-M;
//        int maxm=Q+M;
//        tree=maxv-minv+1+maxm-minm+1;
//        if(Math.max(minv,minm)<=Math.min(maxv,maxm)){
//            tree=Math.max(maxv,maxm)-Math.min(minv,minm)+1;
//        }else {
//            tree=(maxv-minv+1)+(maxm-minm+1);
//        }
//        return tree;
//    }
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        String vasya= scanner.nextLine();
//        String masha = scanner.nextLine();
//        System.out.println(numTreePaint(vasya, masha));
//        scanner.close();
//
//}
    }


