package application;

public class Consulta {
    private Paciente paciente;
    private Dentista dentista;
    private String data;
    private String hora;
    private String servico;
    private double preco;
    
    public Consulta(){
        
    }

    public Consulta(Paciente paciente, Dentista dentista, String data, String hora, String servico, double preco) {
        this.paciente = paciente;
        this.dentista = dentista;
        this.data = data;
        this.hora = hora;
        this.servico = servico;
        this.preco = preco;
    }
    
    

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Dentista getDentista() {
        return dentista;
    }

    public void setDentista(Dentista dentista) {
        this.dentista = dentista;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
}
