public class ProgressaoFibonacci extends Progressao {
    private int anterior;
    private int atual;

    public ProgressaoFibonacci() {
        super(0);
        this.anterior = 1;
        this.atual = 0;
    }

    @Override
    public int proximoNumero() {
        int proximoValor = this.anterior + this.atual;
        this.anterior = this.atual;
        this.atual = proximoValor;
        this.proximo = proximoValor;
        return this.proximo;
    }
}
