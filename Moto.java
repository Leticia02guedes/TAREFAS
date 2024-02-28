public class Moto extends Veiculos{
    private String placa;
    private double quilometragem;

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public double getQuilometragem() {
        return quilometragem;
    }
    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;

        
    }
    public Moto(String cor, String marca, int ano, String modelo, String placa, double quilometragem) {
        super(cor, marca, ano, modelo);
        this.placa = placa;
        this.quilometragem = quilometragem;
    }
    

    
}
