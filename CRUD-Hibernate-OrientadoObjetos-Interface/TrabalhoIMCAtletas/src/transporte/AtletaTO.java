
package transporte;

public class AtletaTO {
    
    private int cod;
    private String nome;
    private int peso;
    private double altura;

    public AtletaTO() {
        super();
    }
    
    public AtletaTO(int cod, String nome, int peso, double altura) {
        super();
        this.cod = cod;
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
