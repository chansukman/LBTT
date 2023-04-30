import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest{
    Calculator calculator = new Calculator();
    Tax taxRange = new Tax(0, 145000, 145001, 250000, 250001, 325000, 325001, 750000, 750001);

    @BeforeEach
    void setUp(){
        this.calculator = new Calculator();
    }

    @AfterEach
    void tearDown(){
        this.calculator = null;
    }

    @Test
    void  checkTaxTest1(){
        assertEquals(0, calculator.checkTax(145000, taxRange));
    }

    @Test
    void checkTaxTest2(){
        assertEquals(2100, calculator.checkTax(250000, taxRange));
    }
    @Test
    void checkTaxTest3(){
        assertEquals(5850, calculator.checkTax(325000, taxRange));
    }
    @Test
    void checkTaxTest4(){
        assertEquals(48350, calculator.checkTax(750000, taxRange));
    }
    @Test
    void checkTaxTest5(){
        assertEquals(54350, calculator.checkTax(800000, taxRange));
    }


    
    
}