public class ProgressaoAritmetica extends Progressao {
    private int razao;

    public ProgressaoAritmetica(int primeiro, int razao) {
        super(primeiro);
        this.razao = razao;
    }

    @Override
    public int proximoNumero() {
        this.proximo += this.razao;
        return this.proximo;
    }
}
