import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SILab2Test {

    SILab2 siLab2 = new SILab2();

    @Test
    void everyStatementTest() {
        List<Angle> testCaseOneAngles = new ArrayList<>();
        testCaseOneAngles.add(new Angle(10, 20, 30));
        testCaseOneAngles.add(new Angle(360, 0, 0));
        assertEquals(2, siLab2.function(testCaseOneAngles).size());

        List<Angle> testCaseTwoAngles = new ArrayList<>();
        testCaseTwoAngles.add(new Angle(10, 20, 70));
        assertThrows(RuntimeException.class, () -> siLab2.function(testCaseTwoAngles));

        List<Angle> testCaseThreeAngles = new ArrayList<>();
        testCaseThreeAngles.add(new Angle(10, 70, 0));
        assertThrows(RuntimeException.class, () -> siLab2.function(testCaseThreeAngles));

        List<Angle> testCaseFourAngles = new ArrayList<>();
        testCaseFourAngles.add(new Angle(360, 10, 0));
        assertThrows(RuntimeException.class, () -> siLab2.function(testCaseFourAngles));

        List<Angle> testCaseFiveAngles = new ArrayList<>();
        testCaseFiveAngles.add(new Angle(720, 0, 0));
        assertThrows(RuntimeException.class, () -> siLab2.function(testCaseFiveAngles));
    }

    @Test
    void multipleConditionsTest() {
        List<Angle> testCaseOneAngles = new ArrayList<>();
        testCaseOneAngles.add(new Angle(10, 0, 0));
        assertEquals(1, siLab2.function(testCaseOneAngles).size());

        List<Angle> testCaseTwoAngles = new ArrayList<>();
        testCaseTwoAngles.add(new Angle(370, 0, 0));
        assertThrows(RuntimeException.class, () -> siLab2.function(testCaseTwoAngles));

        List<Angle> testCaseThreeAngles = new ArrayList<>();
        testCaseThreeAngles.add(new Angle(-10, 0, 0));
        assertThrows(RuntimeException.class, () -> siLab2.function(testCaseThreeAngles));

        List<Angle> testCaseFourAngles = new ArrayList<>();
        testCaseFourAngles.add(new Angle(10, -10, 0));
        assertThrows(RuntimeException.class, () -> siLab2.function(testCaseFourAngles));

        List<Angle> testCaseFiveAngles = new ArrayList<>();
        testCaseFiveAngles.add(new Angle(10, 70, 0));
        assertThrows(RuntimeException.class, () -> siLab2.function(testCaseFiveAngles));

        List<Angle> testCaseSixAngles = new ArrayList<>();
        testCaseSixAngles.add(new Angle(10, 50, 0));
        assertEquals(1, siLab2.function(testCaseSixAngles).size());

        List<Angle> testCaseSevenAngles = new ArrayList<>();
        testCaseSevenAngles.add(new Angle(10, 20, -10));
        assertThrows(RuntimeException.class, () -> siLab2.function(testCaseSevenAngles));

        List<Angle> testCaseEightAngles = new ArrayList<>();
        testCaseEightAngles.add(new Angle(10, 20, 70));
        assertThrows(RuntimeException.class, () -> siLab2.function(testCaseEightAngles));

        List<Angle> testCaseNineAngles = new ArrayList<>();
        testCaseNineAngles.add(new Angle(10, 20, 50));
        assertEquals(1, siLab2.function(testCaseNineAngles).size());

        List<Angle> testCaseTenAngles = new ArrayList<>();
        testCaseTenAngles.add(new Angle(360, 0, 0));
        assertThrows(RuntimeException.class, () -> siLab2.function(testCaseTenAngles));

        List<Angle> testCaseElevenAngles = new ArrayList<>();
        testCaseElevenAngles.add(new Angle(360, 0, 20));
        assertThrows(RuntimeException.class, () -> siLab2.function(testCaseElevenAngles));

        List<Angle> testCaseTwelveAngles = new ArrayList<>();
        testCaseTwelveAngles.add(new Angle(360, 20, 0));
        assertEquals(1, siLab2.function(testCaseTwelveAngles).size());
    }

}
