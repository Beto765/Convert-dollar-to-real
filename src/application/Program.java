package application;

import java.util.Locale;
import java.util.Scanner;
import calculator.CurrencyConverter;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        CurrencyConverter.priceDollar = sc.nextDouble();

        System.out.println("How many dollars will be bought? ");
        CurrencyConverter.bought = sc.nextDouble();

        double valueInReais = CurrencyConverter.valueInReais();
        System.out.printf("Amount to be paid in reais = %.2f%n", valueInReais);

        sc.close();
    }
}

