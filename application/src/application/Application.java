package application;




public class Application {

    public static void main(String[] args) {
        
        Dentista dent1 = new Dentista(1, "Dr. Edson");
        dent1.setEspecialidade("Ortodentia");
        
        Dentista dent2 = new Dentista(2, "Dra. Larissa");
        dent2.setEspecialidade("Ortodentia");
        
        Paciente paciente = new Paciente("Airton");
        paciente.setEmail("airton@sena.com.br");
        
        Consulta cons1 = new Consulta(paciente, dent1, "10/03/2024", "10hr", "canal", 500.0);
    }
    
}
