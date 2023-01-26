package calculator;

import java.util.Arrays;

public class StringCalculator {

    public static int splitAndSum(String numberString) {
        return Arrays.stream(numberString.split(",")).map(String::trim).map(Integer::parseInt).mapToInt(n -> n).sum();
    }
}
