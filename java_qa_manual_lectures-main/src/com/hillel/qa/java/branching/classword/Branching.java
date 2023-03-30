package com.hillel.qa.java.branching.classword;

/**
 * <img src="https://yt3.ggpht.com/sfPp150iI6VC5f4laY-osycP6qgKlT0YDXy47aTwG6HQncqecE36Lt7MG4o9h6L3S93tLcUb_6c=s900-c-k-c0x00ffffff-no-rj"
 * alt="" width="150" height="150">
 * <h1>Розгалуження</h1>
 */
public class Branching {
    /**
     * <p style="font-size:12px">
     * Від програм було б мало користі, якби вони робили абсолютно одне й те саме незалежно
     * від зміни зовнішніх обставин. Потрібно, щоб програма вміла підлаштовуватися під різні
     * ситуації та виконувати одні дії в одних випадках, а інші — в інших.
     * У Java це реалізовано за допомогою розгалуження або умовних операторів.
     * </p>
     * <br>
     * <h2>Що ми з вами розглянемо:</h2>
     * <ol style="font-size:12px">
     *      <li>if - else</li>
     *      <li>switch-case</li>
     * </ol>
     * <h2>Додаткова інформація</h2>
     * @see <a href="https://www.w3schools.com/java/java_conditions.asp">Стаття про if else</a>
     * <br>
     * <a href="https://www.w3schools.com/java/java_switch.asp">Стаття про switch case</a>
     */
    public static void main(String[] args) {
       /*
        Для того щоб розібратися в варіаціях як це працює, розглянемо декілька прикладів.
        Завдання:
        1. Якщо людині рівно 18 років, ми привітаємо її "Вітаю ви вже дорослі!"
       */

        /*
        У прикладі ми бачимо умовний оператор який починається зі слова if,
        далі ми бачимо саму умову age == 18, після умови ми бачимо команду System.out.println.
        Якщо умова виконується, то і буде виконана команда.
        */

       /* int age = 18; // Зміна яка зберігає вік
        if (age == 18) {
            System.out.println("Вітаю ви вже дорослі!");
        }*/

        /*Завдання 2:
         Якщо людині менше ніж 18 років, ми надрукуємо "Ви ще дитина!",
         Все інше "Ви дорослі!"
         -----------------------------------------------------------------
         Як ви бачите у прикладі з'явилося слово else, це можна розуміти так,
         Якщо умова не була виконана, зробіть те що в блоці else
         */

        /* int age = 17;
        if (age < 18){
            System.out.println("Ви ще дитина!");
        } else {
            System.out.println("Ви дорослі!");
        } /*

         /*
         Завдання 3:
         Якщо людині 6 років, ми надрукуємо "Час збиратися до школи!"
         Якщо людині 18 років, ми надрукуємо "Час збиратися до університету!"
         Якщо людині 60 років, ми надрукуємо "Час збиратися до пенсії!"
         ----------------------------------------------------------------
         Як ви бачите у прикладі з'явилося else if та умова (age == 18),
         тобто, якщо одна умова не виконалась, буде перевірятися інша.
         А ще else if можна використовувати скільки завгодно.
         */

        /*int age = 6;
        if (age == 6){
            System.out.println("Час збиратися до школи!");
        } else if (age == 18){
            System.out.println("Час збиратися до університету!");
        } else if (age == 60){
            System.out.println("Час збиратися до пенсії!");
        } else {
            System.out.println("Ви ввели інші дані!");
        }*/

        /* TODO: Зробіть зміну bodyTemperature,
             1. Якщо температура менше 36.6 - виводити "Ви маєте нізьку температуру, зверніться до лікарні!"
             2. Якщо температура дорівнює 36.6 - виводити "Ви здоровий!"
             3. Якщо температура більше 36.6 - виводити "Ви маєте високу температуру, зверніться до лікарні!"
         */

        double Temp = 36.6;
        if (Temp == 36.6){
            System.out.println("Ви здоровий!");
        } else if (Temp < 36.6){
            System.out.println("Ви маєте нізьку температуру, зверніться до лікарні!");
        } else if (Temp > 36.6){
            System.out.println("Ви маєте високу температуру, зверніться до лікарні!");
        }






        /*
            switch-case
            Альтернативою if з великою кількістю гілок служить оператор switch-case.
            Цей оператор має наступну структуру.
         */

        /*int weekDay = 7;
        switch (weekDay) {
            case 1:
                System.out.println("Сьогодні Понеділок!");
                break;
            case 2:
                System.out.println("Сьогодні Вівторок!");
                break;
            case 3:
                System.out.println("Сьогодні Середа!");
                break;
            case 4:
                System.out.println("Сьогодні Четвер!");
                break;
            case 5:
                System.out.println("Сьогодні Пятниця!");
                break;
            case 6:
                System.out.println("Сьогодні Субота!");
                break;
            case 7:
                System.out.println("Сьогодні Неділя!");
                break;
            default:
                System.out.println("Такого дня не існує");
        }*/

        /*
        Оператор починається зі слова switch який на вхід приймає параметр, у нашому випадку це weekDay,
        далі ви можете побачити слово case value - це значення з яким порівнюється наш параметр (weekDay),
        якщо умова відповідає дійсності, то ми виконуємо дію яка всередині case.
        Далі бачимо break - цей оператор опціональний і служить для того, щоб розмежовувати код різних кейсів.
        Default — це значення за замовчуванням. Якщо argument не дорівнюватиме жодному з представлених value,
        то спрацює гілка default і виконається команда default_statement.
         */


    }
}
