public class Main {
    public static void main(String[] args) {
        System.out.println("Hello!");
        int balance = 500;
        int addBalance = 300;
        int bonus = 1;
        int addBonus;
        if (addBalance >= 1000) {
            addBonus = addBalance / 100 * bonus;
        } else {
            addBonus = 0;
            System.out.println("Баланс:" + (balance + addBalance + addBonus));


        }


    }
}

