package calculator;

import java.util.Arrays;

public class StringCalculator {

    public static int splitAndSum(String numberString) {
        if (numberString == null || numberString.isEmpty()) {
            return 0;
        }

        return Arrays.stream(numberString.split("[,:]"))
            .map(String::trim)
            .mapToInt(Integer::parseInt)
            .sum();
    }
}
