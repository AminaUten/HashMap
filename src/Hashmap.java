import java.util.Scanner;
import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, Double> currencies = new HashMap<>();
        currencies.put("USD", 520.08);
        currencies.put("EUR", 599.10);
        currencies.put("RUB", 6.57);
        currencies.put("JPY", 3.33);


        System.out.println("Введите сумму в тг:");
        double sum = input.nextInt();
        System.out.println("Введите валюту:");
        String currency = input.next();

        double totalSum = 0;
        if (currency.equals("USD")) {
            totalSum += sum / currencies.get("USD");
        } else if (currency.equals("EUR")) {
            totalSum += sum / currencies.get("EUR");
        } else if (currency.equals("RUB")) {
            totalSum += sum / currencies.get("RUB");
        } else if (currency.equals("JPY")) {
            totalSum +=sum/ currencies.get("JPY");
        } else {
            System.out.println("Данная валюта на найдена");
        }

        System.out.println(sum + " тенге " + " в " + currency + " составляет: " + totalSum);
    }
}