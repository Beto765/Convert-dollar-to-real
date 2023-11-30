package calculator;

public class CurrencyConverter {

    public static final double percentage = 6;

    public static double priceDollar;
    public static double bought;

    public static double valueInReais() {
        return bought * priceDollar * (1 + percentage / 100);
    }
}
