package Chapter6;

import Chapter6.Practice.Kata;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {

    @Test
    public void aGradeCanBeCalculatedTest(){
        Cata kata = new Cata();
        char result = kata.calculateGradeFor(98);
        assertEquals('A', result);
    }


    @Test
    public void bGradeCanBeCalculatedTest(){
        Cata kata = new Cata();
        char result = kata.calculateGradeFor(84);
        assertEquals('B', result);
    }


    @Test
    public void cGradeCanBeCalculatedTest(){
        Cata kata = new Cata();
        char result = kata.calculateGradeFor(73);
        assertEquals('C', result);
    }


    @Test
    public void dGradeCanBeCalculatedTest(){
        Cata kata = new Cata();
        char result = kata.calculateGradeFor(60);
        assertEquals('D', result);
    }


    @Test
    public void eGradeCanBeCalculatedTest(){
        Cata kata = new Cata();
        char result = kata.calculateGradeFor(51);
        assertEquals('E', result);
    }


    @Test
    public void fGradeCanBeCalculatedTest(){
        Cata kata = new Cata();
        char result = kata.calculateGradeFor(32);
        assertEquals('F', result);
    }


    @Test
    public void aCopiesAndTheirRespectivePrices(){
        Cata copy = new Cata();
        String price = copy.Price(560);
        assertEquals("#1000 per copy", price);
    }


    @Test
    public void bCopiesAndTheirRespectivePrices(){
        Cata copy = new Cata();
        String price = copy.Price(450);
        assertEquals("#1100 per copy", price);
    }


    @Test
    public void cCopiesAndTheirRespectivePrices(){
        Cata copy = new Cata();
        String price = copy.Price(150);
        assertEquals("#1200 per copy", price);
    }


    @Test
    public void dCopiesAndTheirRespectivePrices(){
        Cata copy = new Cata();
        String price = copy.Price(70);
        assertEquals("#1300 per copy", price);
    }


    @Test
    public void eCopiesAndTheirRespectivePrices(){
        Cata copy = new Cata();
        String price = copy.Price(49);
        assertEquals("#1500 per copy", price);
    }


    @Test
    public void fCopiesAndTheirRespectivePrices(){
        Cata copy = new Cata();
        String price = copy.Price(29);
        assertEquals("#1600 per copy", price);
    }


    @Test
    public void gCopiesAndTheirRespectivePrices(){
        Cata copy = new Cata();
        String price = copy.Price(9);
        assertEquals("#1800 per copy", price);
    }


    @Test
    public void hCopiesAndTheirRespectivePrices(){
        Cata copy = new Cata();
        String price = copy.Price(4);
        assertEquals("#2000 per copy", price);
    }



    @Test
    public void arraysTotalCanBeCalculatedTest(){

        int result = Kata.calculateTotalOf(new int[]{1, 2, 3, 4, 5});
        assertEquals(15, result);
    }

    @Test
    public void arraysMinimumCanBeCalculatedTest(){
        int result = Kata.calculateMinimumOf(new int[]{1, 2, 3, 4, 5});
        assertEquals(1, result);
    }

    @Test
    public void arraysMaximumCanBeCalculatedTest(){
        int result = Kata.calculateMaximumOf(new int[]{1, 2, 3, 4, 5});
        assertEquals(5, result);
    }

    @Test
    public void arraysAverageCanBeCalculatedTest(){
        double result = Kata.calculateAverageOf(new int[]{1, 2, 3, 4, 5});
        assertEquals(3.0, result);
    }
}
