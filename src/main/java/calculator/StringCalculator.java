package calculator;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    public static int splitAndSum(String inputString) {
        if (inputString == null || inputString.isEmpty()) {
            return 0;
        }

        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(inputString);
        if (m.find()) {
            String customDelimiter = m.group(1);
            String numberString = m.group(2);
            return splitByDelimiterAndSum(numberString, customDelimiter);
        }

        return splitByDelimiterAndSum(inputString, "[,:]");
    }

    public static int splitByDelimiterAndSum(String numberString, String delimiter) {
        return Arrays.stream(numberString.split(delimiter))
            .map(String::trim)
            .mapToInt(Integer::parseInt)
            .map(StringCalculator::checkMinusInt)
            .sum();
    }

    public static int checkMinusInt(int number) {
        if (number < 0) throw new RuntimeException();
        return number;
    }
}
