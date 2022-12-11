package resources;

import java.util.ArrayList;
import java.util.List;

import entities.Consulta;
import entities.exceptions.ConsultaException;

public class Agenda {

    List<Consulta> consultas = new ArrayList<Consulta>();

    public void adicionar(Consulta consulta) {
            confirmar(consulta);
            this.consultas.add(consulta);
            System.out.println("Add success");
    }

    private void confirmar(Consulta consulta) {
        if (disponibilidade(consulta)) {
            if (consulta.getStatus() == 0) {
                consulta.setStatus(1);
                System.out.println("Confirmado");
            } else if (consulta.getStatus() == 1) {
                throw new ConsultaException("Status Inválido");
            } else {
                throw new ConsultaException("Consulta não encontrada");
            }
        } else {
            throw new ConsultaException("Horário Ocupado!");
        }
    }

    private boolean disponibilidade(Consulta consulta) {
        boolean disponibilidade = true;

        for (Consulta consult : this.consultas) {

            if (consult.equals(consulta)) {
                disponibilidade = false;
            }
        }
        
        return disponibilidade;
    }
}
