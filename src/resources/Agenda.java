package resources;

import java.util.ArrayList;
import java.util.List;

import entities.Consulta;
import entities.exceptions.ConsultaException;

public class Agenda {
    
    List<Consulta> consultas = new ArrayList<Consulta>();

    public void adicionar(Consulta consulta){    

        if(disponibilidade(consulta)){ 
            this.consultas.add(consulta);
            System.out.println("Add success");
        } else {
            throw new ConsultaException("Horário Ocupado!");
        }
    }

    private boolean disponibilidade(Consulta consulta){
        boolean disponibilidade = true;

        for(Consulta consult: this.consultas) { 

            if(consult.equals(consulta)){
                disponibilidade = false;
            }
        }; 
        return disponibilidade;        
    }
}
