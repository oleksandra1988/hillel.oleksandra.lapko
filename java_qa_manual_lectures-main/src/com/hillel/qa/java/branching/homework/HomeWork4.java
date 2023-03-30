package com.hillel.qa.java.branching.homework;

import java.util.Scanner;

public class HomeWork4 {
    /**
     * <p style="font-size:12px">
     * Напишемо програму, яка буде рахувати можливість існування трикутника,
     * виходячи з довжин його сторін.
     * Вимоги:
     *     <ol style="font-size:12px">
     *         <li>Ввести з клавіатури три числа — довжини сторін передбачуваного трикутника.
     *         Для того щоб це зробити самостійно гляньте як працює Scanner scanner = new Scanner(System.in);</li>
     *         <li>Визначити можливість існування трикутника з даними сторонами.</li>
     *         <li> Результат вивести на екран : "Трикутник можливо побудувати" або "Трикутник не можливо побудувати".</li>
     *     </ol>
     * </p>
     *
     * @see <a href="https://www.w3schools.com/java/java_user_input.asp">Стаття як користуватися Scanner</a>
     */
    public static void main(String[] args) {
        Scanner Triangle = new Scanner(System.in);
        System.out.println("Введіть довжину 1 сторони трикутника");
        int Довжина1 = Triangle.nextInt();
        System.out.println("Введіть довжину 2 сторони трикутника");
        int Довжина2 = Triangle.nextInt();
        System.out.println("Введіть довжину 3 сторони трикутника");
        int Довжина3 = Triangle.nextInt();
        if (Довжина1+Довжина2+Довжина3 >= 3) {
            System.out.println("Трикутник можливо побудувати");
        } else {
            System.out.println("Трикутник не можливо побудувати");
        }
    }
}
