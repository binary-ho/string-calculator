package calculator;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//@DisplayName("StringParserTest")
class StringParserTest {

    @Test
    void 문자열_양수_더하기_테스트() {

        Assertions.assertEquals(StringParser.plusNumbersInString("1, 2, 3,", ","), 6);
    }
}