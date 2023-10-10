import java.math.BigDecimal;
import java.math.RoundingMode;

public class PiCalculator {

    public static BigDecimal calculatePi(int numberOfDigits) {
        // Pi = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ...)
        BigDecimal pi = new BigDecimal("0");
        BigDecimal four = new BigDecimal("4");
        for (int i = 0; i < 100000; i++) {  // Increase iteration for more precision
            BigDecimal denominator = new BigDecimal(2 * i + 1);
            BigDecimal term = four.divide(denominator, numberOfDigits, RoundingMode.HALF_UP);
            if (i % 2 == 0) { // if the term is positive
                pi = pi.add(term);
            } else { // if the term is negative
                pi = pi.subtract(term);
            }
        }
        return pi.setScale(numberOfDigits, RoundingMode.HALF_UP);
    }
}
