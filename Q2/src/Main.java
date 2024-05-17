import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo1 = new RetanguloSimples(10, 5, "Retângulo Simples");
        retangulo1.desenhar();

        Retangulo retangulo2 = new RetanguloArredondado(10, 5, "Retângulo Arredondado");
        retangulo2.desenhar();

        Retangulo retangulo3 = new RetanguloDuplo(10, 5, "Retângulo Duplo");
        retangulo3.desenhar();

        Retangulo retangulo4 = new RetanguloASCII(10, 5, "Retângulo ASCII");
        retangulo4.desenhar();

        Retangulo retangulo5 = new RetanguloColorido(10, 5, "Retângulo Colorido", Color.RED);
        retangulo5.desenhar();
    }
}
