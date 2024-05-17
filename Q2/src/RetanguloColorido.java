import java.awt.Color;

// Implementação para desenhar retângulo colorido
class RetanguloColorido implements Retangulo {
    private int largura;
    private int altura;
    private String texto;
    private Color cor;

    public RetanguloColorido(int largura, int altura, String texto, Color cor) {
        this.largura = largura;
        this.altura = altura;
        this.texto = texto;
        this.cor = cor;
    }

    public void desenhar() {
        // Aqui você pode usar bibliotecas gráficas para desenhar um retângulo colorido
        // Vou apenas imprimir uma mensagem para demonstração

        System.out.println("Cor: " + cor.toString());
        System.out.println("Texto: " + texto);
    }
}
