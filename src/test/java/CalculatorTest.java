import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void sunSimpleValue(){
        //arrange
        Calculator calculator = new Calculator();
        double value1 = 10;
        double value2 = 20;
        double expect  = 30;
        double actual = 0;
        //act
        actual = calculator.soma(value1,value2);
        //assert
        Assert.assertEquals(expect,actual,0);
    }
}
