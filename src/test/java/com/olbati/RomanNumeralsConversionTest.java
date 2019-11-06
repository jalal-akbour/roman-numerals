package com.olbati;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeralsConversionTest {

    // Arrange
    RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();
    String romanNumeralValue;

    @Test
    public void when_input_is_1_then_return_roman_number_I () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(1);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("I");
    }

    @Test
    public void when_input_is_2_then_return_roman_number_II () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(2);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("II");
    }

    @Test
    public void when_input_is_3_then_return_roman_number_III () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(3);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("III");
    }

    @Test
    public void when_input_is_4_then_return_roman_number_IV () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(4);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("IV");
    }

    @Test
    public void when_input_is_5_then_return_roman_number_V () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(5);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("V");
    }

    @Test
    public void when_input_is_6_then_return_roman_number_VI () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(6);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("VI");
    }

    @Test
    public void when_input_is_7_then_return_roman_number_VII () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(7);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("VII");
    }

    @Test
    public void when_input_is_8_then_return_roman_number_VIII () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(8);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("VIII");
    }

    @Test
    public void when_input_is_9_then_return_roman_number_IX () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(9);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("IX");
    }

    @Test
    public void when_input_is_10_then_return_roman_number_X () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(10);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("X");
    }

    @Test
    public void when_input_is_11_then_return_roman_number_XI () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(11);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("XI");
    }

    @Test
    public void when_input_is_12_then_return_roman_number_XII () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(12);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("XII");
    }

    @Test
    public void when_input_is_13_then_return_roman_number_XIII () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(13);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("XIII");
    }

    @Test
    public void when_input_is_14_then_return_roman_number_XIV () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(14);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("XIV");
    }

    @Test
    public void when_input_is_15_then_return_roman_number_XV () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(15);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("XV");
    }

    @Test
    public void when_input_is_20_then_return_roman_number_XX () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(20);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("XX");
    }

    @Test
    public void when_input_is_30_then_return_roman_number_XXX () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(30);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("XXX");
    }

    @Test
    public void when_input_is_31_then_return_roman_number_XXXI () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(31);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("XXXI");
    }

    @Test
    public void when_input_is_39_then_return_roman_number_XXXIX () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(39);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("XXXIX");
    }

    @Test
    public void when_input_is_40_then_return_roman_number_XL () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(40);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("XL");
    }


    @Test
    public void when_input_is_41_then_return_roman_number_XLI () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(41);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("XLI");
    }

    @Test
    public void when_input_is_42_then_return_roman_number_XLII () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(42);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("XLII");
    }

    @Test
    public void when_input_is_50_then_return_roman_number_L () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(50);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("L");
    }

    @Test
    public void when_input_is_51_then_return_roman_number_LI () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(51);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("LI");
    }

    @Test
    public void when_input_is_52_then_return_roman_number_LII () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(52);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("LII");
    }

    @Test
    public void when_input_is_59_then_return_roman_number_LIX () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(59);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("LIX");
    }


    @Test
    public void when_input_is_60_then_return_roman_number_LX () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(60);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("LX");
    }

    @Test
    public void when_input_is_61_then_return_roman_number_LXI () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(61);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("LXI");
    }

    @Test
    public void when_input_is_62_then_return_roman_number_LXII () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(62);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("LXII");
    }

    @Test
    public void when_input_is_69_then_return_roman_number_LXIX () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(69);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("LXIX");
    }

    @Test
    public void when_input_is_70_then_return_roman_number_LXX () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(70);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("LXX");
    }


    @Test
    public void when_input_is_80_then_return_roman_number_LXXX () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(80);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("LXXX");
    }

    @Test
    public void when_input_is_89_then_return_roman_number_LXXXIX () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(89);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("LXXXIX");
    }

    @Test
    public void when_input_is_90_then_return_roman_number_XC () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(90);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("XC");
    }

    @Test
    public void when_input_is_91_then_return_roman_number_XCI () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(91);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("XCI");
    }

    @Test
    public void when_input_is_92_then_return_roman_number_XCII () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(92);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("XCII");
    }

    @Test
    public void when_input_is_99_then_return_roman_number_XCIX () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(99);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("XCIX");
    }

    @Test
    public void when_input_is_100_then_return_roman_number_C () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(100);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("C");
    }

    @Test
    public void when_input_is_110_then_return_roman_number_CX () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(110);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("CX");
    }


    @Test
    public void when_input_is_120_then_return_roman_number_CXX () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(120);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("CXX");
    }

    @Test
    public void when_input_is_190_then_return_roman_number_CXC () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(190);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("CXC");
    }

    @Test
    public void when_input_is_199_then_return_roman_number_CXCIX () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(199);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("CXCIX");
    }

    @Test
    public void when_input_is_200_then_return_roman_number_CXCIX () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(200);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("CC");
    }

    @Test
    public void when_input_is_299_then_return_roman_number_CCXCIX () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(299);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("CCXCIX");
    }


    @Test
    public void when_input_is_300_then_return_roman_number_CCC () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(300);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("CCC");
    }


    @Test
    public void when_input_is_399_then_return_roman_number_CCCXCIX () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(399);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("CCCXCIX");
    }


    @Test
    public void when_input_is_400_then_return_roman_number_CD () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(400);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("CD");
    }


    @Test
    public void when_input_is_499_then_return_roman_number_CDXCIX () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(499);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("CDXCIX");
    }

    @Test
    public void when_input_is_500_then_return_roman_number_D () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(500);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("D");
    }

    @Test
    public void when_input_is_501_then_return_roman_number_DI () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(501);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("DI");
    }

    @Test
    public void when_input_is_599_then_return_roman_number_DXCIX () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(599);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("DXCIX");
    }

    @Test
    public void when_input_is_600_then_return_roman_number_DC () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(600);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("DC");
    }

    @Test
    public void when_input_is_699_then_return_roman_number_DCXCIX () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(699);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("DCXCIX");
    }


    @Test
    public void when_input_is_700_then_return_roman_number_DCC () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(700);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("DCC");
    }


    @Test
    public void when_input_is_799_then_return_roman_number_DCCXCIX () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(799);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("DCCXCIX");
    }

    @Test
    public void when_input_is_800_then_return_roman_number_DCCC () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(800);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("DCCC");
    }

    @Test
    public void when_input_is_899_then_return_roman_number_DCCCXCIX () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(899);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("DCCCXCIX");
    }

    @Test
    public void when_input_is_900_then_return_roman_number_CM () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(900);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("CM");
    }

    @Test
    public void when_input_is_901_then_return_roman_number_CMI () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(901);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("CMI");
    }

    @Test
    public void when_input_is_999_then_return_roman_number_CMXCIX () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(999);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("CMXCIX");
    }

    @Test
    public void when_input_is_1000_then_return_roman_number_M () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(1000);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("M");
    }

    @Test
    public void when_input_is_2000_then_return_roman_number_MM () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(2000);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("MM");
    }

    @Test
    public void when_input_is_3000_then_return_roman_number_MMM () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(3000);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("MMM");
    }


    @Test
    public void when_input_is_upper_than_3000_then_return_empty_roman_number () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(3001);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("");
    }

    @Test
    public void when_input_is_0_then_return_empty_roman_number () {
        // Act
        romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(0);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("");
    }
}

