// Implementação para desenhar retângulo com bordas duplas
class RetanguloDuplo implements Retangulo {
    private int largura;
    private int altura;
    private String texto;

    public RetanguloDuplo(int largura, int altura, String texto) {
        this.largura = largura;
        this.altura = altura;
        this.texto = texto;
    }

    public void desenhar() {
        System.out.println("╔" + "═".repeat(largura) + "╗");
        for (int i = 0; i < altura; i++) {
            System.out.println("║" + " ".repeat(largura) + "║");
        }
        System.out.println("╚" + "═".repeat(largura) + "╝");
        System.out.println(texto);
    }
}
