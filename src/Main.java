public class Main {
    public static void main(String[] args) {

    Task1 task1 = new Task1();
    task1.exception1 = 13;
    task1.exception2 = 66;

    task1.getResult1();

    Task2 task2 = new Task2();
    task2.i = 1;
    task2.maxValue = 1000;

    task2.getResult2();

    CreditCard user1 = new CreditCard();
    user1.cardNumber = "4458566498761234";
    user1.owner = "SERHII KOVALENKO";
    user1.type = "VISA";

    CreditCard user2 = new CreditCard();
    user2.cardNumber = "5458566498761234";
    user2.owner = "TETIANA KOVALENKO";
    user2.type = "MASTERCARD";

    CreditCard user3 = new CreditCard();
    user3.cardNumber = "2458566498761234";
    user3.owner = "VLADIMIR PUTIN";
    user3.type = "MIR";

    CreditCard user4 = new CreditCard();
    user4.cardNumber = "8458566498761234";
    user4.owner = "ARTEM KOVALENKO";
    user4.type = "AMEX";

    user1.printText();
    user1.getResult3();
    user2.getResult3();
    user3.getResult3();
    user4.getResult3();
    }
}