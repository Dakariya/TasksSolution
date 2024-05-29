package com.javaex.yamdexcontest;

import java.util.Scanner;
//Лог без дат
//
//Ограничение времени 2 секунды
//Ограничение памяти 256Mb
//
//Ввод стандартный ввод или input.txt
//Вывод стандартный вывод или output.txt
//
//Вася решил обработать логи с сервера, но обнаружил, что из-за ошибки разработчиков для каждого события в логе записывается только время этого события в формате HH:MM:SS, а дата не записывается.
//Известно, что все события записаны в хронологическом порядке и два события не могли произойти в одну и ту же секунду. Определите минимальное количество дней, в течение которых записывался лог.
//
//Формат ввода
//Первая строка входных данных содержит единственное число n (1≤n≤100000) — количество событий в логе. Следующие n строк описывают времена событий. Каждая строка имеет формат HH:MM:SS, где HH — число от 0 до 23, а MM и SS — числа от 0 до 59. Все записи чисел состоят ровно из двух цифр.
//
//Формат вывода
//Выведите одно целое число — минимальное количество дней, в течение которых записывался лог.

public class TimeConverter {
//    public static int timeToSeconds(String time) {
//        String[] parts = time.split(":");
//        int hours = Integer.parseInt(parts[0]);
//        int minutes = Integer.parseInt(parts[1]);
//        int seconds = Integer.parseInt(parts[2]);
//        return hours * 3600 + minutes * 60 + seconds;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int counter = Integer.parseInt(scanner.nextLine());
//        int lastLog = timeToSeconds(scanner.nextLine());
//        int days = 1;
//
//        for (int i = 0; i < counter - 1; i++) {
//            int newLog = timeToSeconds(scanner.nextLine());
//            if (newLog <= lastLog) {
//                days++;
//            }
//            lastLog = newLog;
//        }
//
//        System.out.println(days);
//
//        scanner.close();
//    }
}
