package calculator;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

//@DisplayName("StringParserTest")
class StringCalculatorTest {

    @Test
    void 문자열_양수_더하기_테스트() {

        assertEquals(StringCalculator.splitAndSum("1,2,3"), 6);
    }

    @Test
    public void splitAndSum_null_또는_빈문자() throws Exception {
        int result = StringCalculator.splitAndSum(null);
        assertEquals(result, 0);

        result = StringCalculator.splitAndSum("");
        assertEquals(result, 0);
    }

    @Test
    public void splitAndSum_숫자하나() throws Exception {
        int result = StringCalculator.splitAndSum("1");
        assertEquals(result, 1);
    }
}