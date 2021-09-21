/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalender;

import java.util.Scanner;

 /**
 * @author Vladimir
 */
public class Kalender {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in); // Scanner считывает введенные пользователем данные.
    System.out.print("Введите год: ");
    int year = s.nextInt(); // Вводим год, для которого нужно подобрать описание.

    int yearSinceCycleStart = year - 1984; // Считаем, какой по счету год от начала цикла.


    // % остаток от деления.
    // 2021-й год - 37-й от начала цикла.
    // 37 % 12 = 1 убирает "лишние" 12-годичные подциклы и мы получаем, что с начала подцикла прошел 1 год.
    // То есть 2021-й - второй год с начала 12-годичного подцикла.
    int animalNum = yearSinceCycleStart % 12;
    int colorNum = yearSinceCycleStart % 5;
    String yearDescription = "";

    // Смотрим, какому цвету соответствует год.
    // Switch действует так же как if -> else if -> else if..., но обычно выглядит более опрятно.
    switch (colorNum) {
        case 0:
            yearDescription = "зелен";
            break;
        case 1:
            yearDescription = "красн";
            break;
        case 2:
            yearDescription = "желт";
            break;
        case 3:
            yearDescription = "бел";
            break;
        case 4:
            yearDescription = "черн";
    }

    // Подбираем окончание для цвета в зависимости от рода животного.
    // Прошло 2 года с начала цикла, значит год тигра, 3 - год зайца, 4 - год дракона. Им нужно окончание "ого".
    // Все остальные животные женского рода. Им нужно окончание "ой".
    if (animalNum == 2 || animalNum == 3 || animalNum == 4) {
        yearDescription += "ого ";
    } else {
        yearDescription += "ой ";
    }

    // Смотрим, какому животному соответствует год.
    switch (animalNum) {
        case 0:
            yearDescription += "крысы";
            break;
        case 1:
            yearDescription += "коровы";
            break;
        case 2:
            yearDescription += "тигра";
            break;
        case 3:
            yearDescription += "зайца";
            break;
        case 4:
            yearDescription += "дракона";
            break;
        case 5:
            yearDescription += "змеи";
            break;
        case 6:
            yearDescription += "лошади";
            break;
        case 7:
            yearDescription += "овцы";
            break;
        case 8:
            yearDescription += "обезьяны";
            break;
        case 9:
            yearDescription += "курицы";
            break;
        case 10:
            yearDescription += "собаки";
            break;
        case 11:
            yearDescription += "свиньи";
            break;
    }

    System.out.printf("%d - год %s.", year, yearDescription);
    }

}
   


