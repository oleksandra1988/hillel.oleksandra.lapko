package com.hillel.qa.java.branching.homework;

public class HomeWork3 {
    /**
     * <h1>Вимоги</h1>
     * <p style="font-size:12px">
     * 1. Оплата за товар проводитиметься способами:
     * <br>
     * - готівкою, додаткова комісія не стягується;
     * <br>
     * - карткою, стягується додаткова комісія 2% від суми купівлі.
     * <br>
     * - за рахунком, стягується додаткова комісія 5% від суми купівлі.
     * <br>
     * 2. Сума купівлі (призначити самостійно) сплачена карткою.
     * <br>
     * 3. Виведіть суму для оплати (сума купівлі з урахуванням суми комісії).
     * <br>
     * 4. Врахуйте варіанти виведення, коли немає відповідності будь-якому способу оплати.
     * <br>
     * 5. Завдання необхідно виконати за допомогою switch case
     * </p>
     */
    public static void main(String[] args) {
            int Total = 200;
            String PaymentMethod = "Credit Card";

                  switch (PaymentMethod) {
            case "Cash":
                      System.out.println("Payment by cash. Sum to pay:"+ Total);
                       break;
            case "Credit Card":
                      System.out.println("Payment by credit card. Sum to pay:" + (Total*2/100+Total));
                       break;
            case "Account payment":
                      System.out.println("Payment to account. Sum to pay:" +  (Total*5/100+Total));
                       break;
            default:
                      System.out.println("Invalid payment method");

         }
    }


    }

        /*switch (cevfljcgkfnb) {
            case 100:
                System.out.println("Оплата готівкою. Сума до сплати 100");
                break;
           /*case Credit/Debit Card:
                System.out.println("Card payment");
                break;
            case 105:
                System.out.println("Оплата за рахунком. Сума до сплати 105");
                break;
            default:
                System.out.println("Недійсний спосіб оплати");
        }

        }

    } */

