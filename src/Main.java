public class Main {
    public static void main(String[] args) {
        int account = 800;
        int sum = 400;
        int bonus;
        int balance;


        if ((account + sum) > 1000) {

            bonus = (account + sum - 1000) / 100;


            balance = account + sum + bonus;

            System.out.println("Начислено бонусов на " + bonus + " рублей, итоговый баланс " + balance + " рублей.");
        } else {
            balance = account + sum;

            System.out.println("Бонусов не начислено. Итоговый баланс " + balance + " рублей.");
        }
    }
}

