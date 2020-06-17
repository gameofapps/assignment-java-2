package xyz.jdtec.algorithms;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


class AlgorithmsTest {
    // Instantiate our own output stream so we can test methods that print to stdout
    ByteArrayOutputStream outStream = new ByteArrayOutputStream();

    // Different OSes have different "line separators" to check for: CRLF or LF
    String lf = System.lineSeparator();

    // --- Setup and Teardown --- //

    @BeforeEach
    void setUp() {
        // Reset our own output stream and redirect stdout into it
        outStream.reset();
        System.setOut(new PrintStream(outStream));
    }

    @AfterEach
    void tearDown() {
        // Redirect stdout back to System stream
        System.setOut(System.out);
    }

    // --- findPairs() Tests --- //

    @Test
    void findPairsTestInputTooShort() {
        // Check for array length < 2 case
        Algorithms.findPairs(new int[] {1}, 6);
        assertEquals("", outStream.toString());
    }

    @Test
    void findPairs() {
        // Check for example case
        Algorithms.findPairs(new int[] {2, 4, 5, 1, 3, 5, 4}, 6);
        assertEquals("(1, 5)" + lf + "(4, 2)" + lf, outStream.toString());
    }

    @Test
    void findPairsTestNegativesAndZeroes() {
        // Check for negatives and zeroes
        Algorithms.findPairs(new int[] {-2, 8, 5, 6, 0, -9, 15}, 6);
        assertEquals("(8, -2)" + lf + "(0, 6)" + lf + "(15, -9)" + lf, outStream.toString());
    }

    @Test
    void findPairsTestRepeats() {
        // Check for repeats
        Algorithms.findPairs(new int[] {-2, 8, -2, 8, -2, 8, -2, 8}, 6);
        assertEquals("(8, -2)" + lf, outStream.toString());
    }

    @Test
    void findPairsTestNoPairs() {
        // Check for none found
        Algorithms.findPairs(new int[] {1, 0}, 6);
        assertEquals("", outStream.toString());
    }

    // --- isPalindrome() Tests --- //

    @Test
    void isPalindromeTestExamples() {
        assertTrue(Algorithms.isPalindrome("radar"));           // example case
        assertTrue(Algorithms.isPalindrome("BOb"));             // example case + random capitalization
        assertTrue(Algorithms.isPalindrome("asdfdsa"));         // example case
    }

    @Test
    void isPalindromeTestNonPalindromes() {
        assertFalse(Algorithms.isPalindrome("awesome"));        // non-palindrome case
        assertFalse(Algorithms.isPalindrome("Game of Apps"));   // non-palindrome case + random capitalization
    }
}