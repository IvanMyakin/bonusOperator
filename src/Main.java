public class Main {
    public static void main(String[] args) {
        int initialAccount = 300; // деньги на счету клиента
        int depositAmount = 1200; // сумма пополнения
        int bonus;
        if (depositAmount >= 1000) {
            bonus = depositAmount / 100 * 1 + initialAccount + depositAmount;
            System.out.println(bonus);
        } else {
            System.out.println(initialAccount + depositAmount + " " + "Бонусы не начислены");
        }
    System.out.println("Спасибо за пополнение счета!");
    }
}
