package resources;

import java.util.ArrayList;
import java.util.List;

import entities.Consulta;

public class Agenda {
    
    List<Consulta> consultas = new ArrayList<Consulta>();

    public void adicionar(Consulta consulta){
    }

    public boolean disponibilidade(Consulta consulta){

        this.consultas.add(new Consulta(0, 0, 0, 0, 
        null));
        
        Boolean disponibilidade = true;
        
        for(Consulta consult: this.consultas) {      

            if(consulta.getDia() == consult.getDia() 
            || consulta.getMes() == consult.getMes()
            || consulta.getAno() == consult.getAno()
            || consulta.getHora() == consult.getHora()){
                disponibilidade = false;
            }
        }; 

        return disponibilidade;        
    }
}
