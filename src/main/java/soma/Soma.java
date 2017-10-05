package soma;

public class Soma {

  /**
   * Construtor da classe.
   *
   * @throws IllegalStateException caso seja criado uma instância da classe.
   */
    protected Soma() {
        throw new IllegalStateException("Classe sem instância");
    }

    /**
     * Retorna a soma de dois inteiros
     *
     * @param a, b são inteiros fornecidos
     * 
     * @return soma de a + b
     */
    public static int soma(int a, int b) {
        return a + b;
    }
}
