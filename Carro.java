public class Carro extends Veiculos {
    
    private int potencia;
    private String placa;
    private int portas;

    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }
    public Carro(String cor, String marca, int ano, String modelo, int potencia, String placa, int portas) {
        super(cor, marca, ano, modelo);
        this.potencia = potencia;
        this.placa = placa;
        this.portas = portas;
    }

    
}
