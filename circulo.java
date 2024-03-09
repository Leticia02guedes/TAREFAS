public class circulo {
    import java.lang.Math;

class Ponto {
    private double x;
    private double y;

    // Construtor
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Método para calcular a distância entre dois pontos
    public double calcularDistancia(Ponto outroPonto) {
        double deltaX = outroPonto.x - this.x;
        double deltaY = outroPonto.y - this.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    // Getters e setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando dois pontos
        Ponto ponto1 = new Ponto(3, 4);
        Ponto ponto2 = new Ponto(6, 8);

        // Calculando a distância entre os dois pontos
        double distancia = ponto1.calcularDistancia(ponto2);
        System.out.println("A distância entre os pontos é: " + distancia);
    }

    @Override
    public String toString() {
        return "Main []";
    }
}

}
