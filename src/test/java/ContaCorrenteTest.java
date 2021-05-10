import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class) @PrepareForTest(ContaCorrente.class)
public class ContaCorrenteTest {

    @Test
    public void depositarValorPositivo(){
        //arrange
        ContaCorrente contaCorrente = new ContaCorrente();
        double valor = 10;
        double esperado = 10;
        double resultado = 0;
        //act
        resultado = contaCorrente.depositar(valor);

        //Assert
        Assert.assertEquals(esperado, resultado, 0);
    }

    @Test
    public void deveRetornarSaldoZeroDeDeposito()
    {
        //arrange
        ContaCorrente contaCorrente = new ContaCorrente();
        double valorDeposito = 0;
        double esperado = 0;
        double actual = 0;
        //act
        actual = contaCorrente.depositar(valorDeposito);

        //Assert
        Assert.assertEquals(esperado, actual, 0);
    }

    @Test
    public void deveRetornarSaldoZeroComValorMaiorQueDezDeDeposito()
    {
        //arrange
        ContaCorrente contaCorrente = new ContaCorrente();
        double valorDeposito = 11;
        double esperado = 0;
        double actual = 0;
        //act
        actual = contaCorrente.depositar(valorDeposito);

        //Assert
        Assert.assertEquals(esperado, actual, 0);
    }

    @Test
    public void deveRetornarSaldoValorUmDeDeposito()
    {
        //arrange
        ContaCorrente contaCorrente = new ContaCorrente();
        double valorDeposito = 1;
        double esperado = 1;
        double actual = 0;
        //act
        actual = contaCorrente.depositar(valorDeposito);

        //Assert
        Assert.assertEquals(esperado, actual, 0);
    }

}
