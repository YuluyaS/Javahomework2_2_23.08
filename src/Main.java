public class Main {
    public static void main(String[] args) {
        int account = 100;
        int sum = 300;
        int bonus;
        int balance;

        if (sum > 1000) {

            bonus = sum / 100;

            balance = account + sum + bonus;

            System.out.println("Начислено бонусов на " + bonus + " рублей, итоговый баланс " + balance + " рублей.");
        } else {
            balance = account + sum;

            System.out.println("Бонусов не начислено. Итоговый баланс " + balance + " рублей.");
        }
    }
}