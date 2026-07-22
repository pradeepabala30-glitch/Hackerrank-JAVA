//input currency in rupees and output in USD.
import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyExample {
    public static void main(String[] args) {
        double amount = 1234.56;
         NumberFormat usdFormatter = NumberFormat.getCurrencyInstance(Locale.US);
         String formattedUSD = usdFormatter.format(amount);
        System.out.println(formattedUSD); 
    }
}
