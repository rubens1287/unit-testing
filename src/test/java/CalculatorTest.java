import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;

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

    @Test
    public void testDepositarValorComSaldoZero() throws Exception {
        //arrange
        ContaCorrente contaMock =  new ContaCorrente();
        final String METHOD="getSaldo";

        ContaCorrente spy = PowerMockito.spy(contaMock);
        PowerMockito.when(spy, METHOD)
                .thenReturn( (Double) 990.00);
        double expect = 1000;
        double actual = 0;
        double valorDep = 10;
        //act
        actual = spy.depositar(valorDep);
        //assert
        Assert.assertEquals(expect, actual, 0);
        PowerMockito.verifyPrivate(spy, Mockito
                .times(1))
                .invoke("getSaldo");

    }
}
