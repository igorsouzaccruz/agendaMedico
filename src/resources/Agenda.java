package resources;

import entities.Consulta;
import entities.Paciente;
import entities.exceptions.ConsultaException;


import java.util.ArrayList;
import java.util.List;

public class Agenda {
    List<Consulta> consultas = new ArrayList<Consulta>();

    public void adicionar(Consulta consulta) {
        if (disponibilidade(consulta) && consulta.getStatus() == 0) {
            this.consultas.add(consulta);
            System.out.println(consulta.getStatus() + " - Adicionado com Sucesso!");
        } else {
            throw new ConsultaException("Horário Ocupado!");
        }
    }

    public void confirmar(Consulta consulta) {
        boolean isReserved = !disponibilidade(consulta); 
        if (isReserved) {
            if (consulta.getStatus() == 0) {
                consulta.setStatus(1);
                System.out.println(consulta.getStatus()+" - Confirmado");
            } else if (consulta.getStatus() > 0) {
                throw new ConsultaException("Status Inválido");
            } else {
                throw new ConsultaException("Consulta não encontrada");
            }
        } else {
            throw new ConsultaException("Horário Ocupado!");
        }
    }

    public void realizar(Consulta consulta){
        if(consulta.getStatus() == 1) {
            consulta.setStatus(2);
            System.out.println(consulta.getStatus()+" - Realizado");
        } else if (consulta.getStatus() != 1) {
            throw new ConsultaException("Status Inválido");
        } else {
            throw new ConsultaException("Consulta não encontrada");
        }
    }

    public void cancelar(Consulta consulta){
        if(consulta.getStatus() == 1 || consulta.getStatus() == 0) {
            consulta.setStatus(3);
            System.out.println(consulta.getStatus()+" - Consulta cancelada!");
        } else if (consulta.getStatus() > 1) {
            throw new ConsultaException("Status Inválido");
        } else {
            throw new ConsultaException("Consulta não encontrada");
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

    public void listar(int dia, int mes,int ano){
        List<Consulta> consultasAgendadas = new ArrayList<Consulta>();
        for(Consulta consult: this.consultas){
            if(consult.getDia() == dia &&
                consult.getMes() == mes &&
                consult.getAno() == ano){
                consultasAgendadas.add(consult);
            }
        }
        for(Consulta consultaAgendada: consultasAgendadas){
            System.out.println(consultaAgendada.mostrar());
        }
    }
    public void pesquisar(String cpf){
        List<Consulta> consultasAgendadas = new ArrayList<Consulta>();
        for(Consulta consult: this.consultas){
            if(consult.getPaciente().getCpf() == cpf){
                consultasAgendadas.add(consult);
            } else {
                System.out.println("CPF não encontrado!");
                break;
            }
        }
        for(Consulta consultaAgendada: consultasAgendadas){
            System.out.println(consultaAgendada.mostrar());
        }
    }
}