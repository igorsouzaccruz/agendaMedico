package resources;

import java.util.ArrayList;
import java.util.List;

import entities.Consulta;

public class Agenda {
    
    List consultas = new ArrayList<Consulta>();

    public void adicionar(Consulta consulta){
    }

    public void disponibilidade(){

        this.consultas.add(new Consulta(0, 0, 0, 0, null));
        this.consultas.forEach(consult -> {
            
            System.out.println(consult);
        }); 
    }
}
