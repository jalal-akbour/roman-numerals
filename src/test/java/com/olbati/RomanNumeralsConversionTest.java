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
}

