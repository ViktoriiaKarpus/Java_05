import org.testng.Assert;
import org.testng.annotations.Test;

public class FizzBuzzTest {

    // 1. Positive testing Happy path
    // if ( start <= end )
    // return array;


    @Test

    public void testStartLessThanEnd_HappyPath() {
        //AAA
        //arrange
        int start = 1;
        int end = 20;
        String[] expectedResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8",
                "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz" };

        //act


        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testStartLessThanEnd_NegativePath() {
        //AAA
        //arrange
        int start = 1;
        int end = 20;
        String[] expectedResult = {"2", "Fizz", "4", "Buzz", "Fizz", "7", "8",
                "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz" };

        //act


        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testStartLessThanEnd_NegativePath2() {
        //AAA
        //arrange
        int start = -20;
        int end = -1;
        String[] expectedResult = {"2", "Fizz", "4", "Buzz", "Fizz", "7", "8",
                "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz" };

        //act


        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testStartLessThanEnd_NegativePath3() {
        //AAA
        //arrange
        int start = -20;
        int end = -1;
        String[] expectedResult = {"Buzz", "-19", "Fizz", "-17", "-16", "FizzBuzz", "-14", "-13", "Fizz", "-11",
                "Buzz", "Fizz", "-8", "-7", "Fizz", "Buzz", "-4", "Fizz", "-2", "-1"};


        //act


        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //
        Assert.assertEquals(actualResult, expectedResult);

    }

    public void testStartLessThanEnd_NegativePath4() {
        //AAA
        //arrange
        int start = 1;
        int end = 1;
        String[] expectedResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8",
                "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz" };

        //act


        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //
        Assert.assertEquals(actualResult, expectedResult);

    }



}





