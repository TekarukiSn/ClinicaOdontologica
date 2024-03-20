package application;

import java.util.ArrayList;

public class BancoDeDados {
    private static ArrayList<Paciente> listaPaciente = new ArrayList<>();
    private static ArrayList<Dentista> listaDentista = new ArrayList<>();
    
    public void addPaciente(Paciente paciente){
        listaPaciente.add(paciente);
    }
    
    public void addDentista(Dentista dentista){
        listaDentista.add(dentista);
    }

    public ArrayList<Paciente> getListaPaciente() {
        return listaPaciente;
    }

    public ArrayList<Dentista> getListaDentista() {
        return listaDentista;
    }
    
    
}
