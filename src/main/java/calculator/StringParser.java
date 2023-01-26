package calculator;

import java.util.Arrays;

public class StringParser {

    public static int plusNumbersInString(String numberString, String regex) {
        return Arrays.stream(numberString.split(regex)).map(String::trim).map(Integer::parseInt).mapToInt(n -> n).sum();
    }
}
