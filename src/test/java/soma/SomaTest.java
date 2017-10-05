package soma;

import org.junit.*;

public class SomaTest {

    /**
     * Testa o construtor.
     *
     * @throws IllegalStateException Caso a classe seja instanciada.
     */
    @Test(expected = IllegalStateException.class)
    public void testIllegalState() throws Exception {
        new Soma();
    }

    /**
     * Testa uma soma correta.
     */
    @Test
    public void testSoma() throws Exception {
        Assert.assertEquals(Soma.soma(2, 2), 4);
        Assert.assertEquals(Soma.soma(15, 20), 35);
    }
}
