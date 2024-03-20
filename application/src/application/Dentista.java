package application;

public class Dentista {
    private int cro;
    private String nome;
    private String especialidade;

    
    public Dentista(){
        
    }
    
    public Dentista(int cro, String nome) {
        this.cro = cro;
        this.nome = nome;
    }

    public int getCro() {
        return cro;
    }

    public void setCro(int cro) {
        this.cro = cro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    
}
