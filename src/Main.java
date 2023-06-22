// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int amount = 1236;
        int cashIn = 56;

        int totalAmount = amount + cashIn;
        int bonus = 0;
        if (cashIn > 1000) {
            bonus = cashIn / 100;
            totalAmount = totalAmount + bonus;
        }
        System.out.println("Initial amount : " + amount + "; client added: " + cashIn);
        System.out.println("Total amount: " + totalAmount + "; bonus: " + bonus);


    }
}