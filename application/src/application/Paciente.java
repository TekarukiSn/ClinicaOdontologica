package application;

public class Paciente {
    private int id;
    private String nome;
    private String plano;
    private String email;
    
    private static int proximoId = 1;
   
    
    public Paciente(String nome) {
        this.id = proximoId;
        proximoId++;
        this.nome = nome;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
