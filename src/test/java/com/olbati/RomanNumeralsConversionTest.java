package com.olbati;

import org.junit.Assert;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeralsConversionTest {

    @Test
    public void when_input_is_1_Then_return_I () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(1);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("I");

    }

    @Test
    public void when_input_is_2_Then_return_II () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(2);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("II");
    }

    @Test
    public void when_input_is_3_Then_return_III () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(3);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("III");
    }

    @Test
    public void when_input_is_4_Then_return_IV () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(4);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("IV");
    }

    @Test
    public void when_input_is_5_Then_return_V () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(5);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("V");
    }

    @Test
    public void when_input_is_6_Then_return_VI () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(6);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("VI");
    }

    @Test
    public void when_input_is_7_Then_return_VII () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(7);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("VII");
    }

    @Test
    public void when_input_is_8_Then_return_VIII () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(8);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("VIII");
    }

    @Test
    public void when_input_is_9_Then_return_IX () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(9);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("IX");
    }

    @Test
    public void when_input_is_10_Then_return_X () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(10);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("X");
    }

    @Test
    public void when_input_is_11_Then_return_XI () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(11);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("XI");
    }

    @Test
    public void when_input_is_12_Then_return_XII () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(12);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("XII");
    }

    @Test
    public void when_input_is_13_Then_return_XIII () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(13);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("XIII");
    }

    @Test
    public void when_input_is_14_Then_return_XIV () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(14);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("XIV");
    }

    @Test
    public void when_input_is_15_Then_return_XV () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(15);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("XV");
    }

    @Test
    public void when_input_is_20_Then_return_XX () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(20);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("XX");
    }

    @Test
    public void when_input_is_30_Then_return_XXX () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(30);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("XXX");
    }

    @Test
    public void when_input_is_31_Then_return_XXXI () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(31);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("XXXI");
    }

    @Test
    public void when_input_is_39_Then_return_XXXIX () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(39);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("XXXIX");
    }

    @Test
    public void when_input_is_40_Then_return_XL () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(40);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("XL");
    }


    @Test
    public void when_input_is_41_Then_return_XLI () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(41);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("XLI");
    }

    @Test
    public void when_input_is_42_Then_return_XLII () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(42);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("XLII");
    }

    @Test
    public void when_input_is_50_Then_return_L () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(50);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("L");
    }

    @Test
    public void when_input_is_51_Then_return_LI () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(51);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("LI");
    }

    @Test
    public void when_input_is_52_Then_return_LII () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(52);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("LII");
    }

    @Test
    public void when_input_is_59_Then_return_LIX () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(59);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("LIX");
    }


    @Test
    public void when_input_is_60_Then_return_LX () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(60);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("LX");
    }

    @Test
    public void when_input_is_61_Then_return_LXI () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(61);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("LXI");
    }

    @Test
    public void when_input_is_62_Then_return_LXII () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(62);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("LXII");
    }

    @Test
    public void when_input_is_69_Then_return_LXIX () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(69);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("LXIX");
    }

    @Test
    public void when_input_is_70_Then_return_LXX () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(70);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("LXX");
    }


    @Test
    public void when_input_is_80_Then_return_LXXX () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(80);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("LXXX");
    }

    @Test
    public void when_input_is_89_Then_return_LXXXIX () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(89);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("LXXXIX");
    }

    @Test
    public void when_input_is_90_Then_return_XC () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(90);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("XC");
    }

    @Test
    public void when_input_is_91_Then_return_XCI () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(91);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("XCI");
    }

    @Test
    public void when_input_is_92_then_return_XCII () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(92);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("XCII");
    }

    @Test
    public void when_input_is_99_then_return_XCIX () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(99);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("XCIX");
    }

    @Test
    public void when_input_is_100_then_return_C () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(100);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("C");
    }

    @Test
    public void when_input_is_110_then_return_CX () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(110);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("CX");
    }


    @Test
    public void when_input_is_120_then_return_CXX () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(120);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("CXX");
    }

    @Test
    public void when_input_is_190_then_return_CXC () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(190);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("CXC");
    }

    @Test
    public void when_input_is_199_then_return_CXCIX () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(199);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("CXCIX");
    }

    @Test
    public void when_input_is_200_then_return_CXCIX () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(200);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("CC");
    }

    @Test
    public void when_input_is_299_then_return_CCXCIX () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(299);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("CCXCIX");
    }


    @Test
    public void when_input_is_300_then_return_CCC () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(300);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("CCC");
    }


    @Test
    public void when_input_is_399_then_return_CCCXCIX () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(399);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("CCCXCIX");
    }


    @Test
    public void when_input_is_400_then_return_CD () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(400);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("CD");
    }


    @Test
    public void when_input_is_499_then_return_CDXCIX () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(499);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("CDXCIX");
    }

    @Test
    public void when_input_is_500_then_return_D () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(500);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("D");
    }

    @Test
    public void when_input_is_501_then_return_DI () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(501);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("DI");
    }

    @Test
    public void when_input_is_599_then_return_DXCIX () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(599);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("DXCIX");
    }

    @Test
    public void when_input_is_600_then_return_DC () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(600);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("DC");
    }

    @Test
    public void when_input_is_699_then_return_DCXCIX () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(699);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("DCXCIX");
    }


    @Test
    public void when_input_is_700_then_return_DCC () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(700);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("DCC");
    }


    @Test
    public void when_input_is_799_then_return_DCCXCIX () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(799);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("DCCXCIX");
    }

    @Test
    public void when_input_is_800_then_return_DCCC () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(800);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("DCCC");
    }

    @Test
    public void when_input_is_899_then_return_DCCCXCIX () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(899);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("DCCCXCIX");
    }

    @Test
    public void when_input_is_900_then_return_CM () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(900);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("CM");
    }

    @Test
    public void when_input_is_901_then_return_CMI () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(901);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("CMI");
    }

    @Test
    public void when_input_is_999_then_return_CMXCIX () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(999);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("CMXCIX");
    }

    @Test
    public void when_input_is_1000_then_return_M () {
        // Arrange
        RomanNumeralsConversion romanNumeralsConversion = new RomanNumeralsConversion();

        // Act
        String romanNumeralValue = romanNumeralsConversion.normalToRomanConvertor(1000);

        // Assert
        assertThat(romanNumeralValue).isEqualTo("M");
    }




}

