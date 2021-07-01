import org.junit.Assert;
import org.junit.Test;

public class AbsolutoTest {

    @Test
    public void testComValorMenorQueZero(){
        //arrange
        Absoluto absoluto = new Absoluto();
        int actual;
        int expect = 1;
        //act
        actual = absoluto.retornaValorAbsoluto(-1);
        //assert
        Assert.assertEquals(expect,actual);
    }

    @Test
    public void testComValorZero(){
        //arrange
        Absoluto absoluto = new Absoluto();
        int actual;
        int expect = 0;

        //act
        actual = absoluto.retornaValorAbsoluto(0);

        //assert
        Assert.assertEquals(expect,actual);
    }


}
