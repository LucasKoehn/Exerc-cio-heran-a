public class Progressao {
    protected int primeiro;
    protected int proximo;

    public Progressao(int primeiro) {
        this.primeiro = primeiro;
        this.proximo = primeiro;
    }

    public int proximoNumero() {
        throw new UnsupportedOperationException("Subclasses devem implementar o método proximoNumero.");
    }

    public void reiniciar() {
        this.proximo = this.primeiro;
    }
}
