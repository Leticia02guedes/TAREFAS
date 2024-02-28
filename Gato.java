public class Gato extends Animal {
    
    private String raca;
    private String corPelo;
    private String corOlho;
    private String porte;
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String getCorPelo() {
        return corPelo;
    }
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    public String getCorOlho() {
        return corOlho;
    }
    public void setCorOlho(String corOlho) {
        this.corOlho = corOlho;
    }
    public String getPorte() {
        return porte;
    }
    public void setPorte(String porte) {
        this.porte = porte;
    }
    public Gato(String nome, int idade, String sexo, String raca, String corPelo, String corOlho, String porte) {
        super(nome, idade, sexo);
        this.raca = raca;
        this.corPelo = corPelo;
        this.corOlho = corOlho;
        this.porte = porte;
    }

    
}
