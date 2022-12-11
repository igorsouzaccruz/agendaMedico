package entities;

public class Consulta {
    
    private int dia;
    private int mes;
    private int ano;
    private int hora;
    private int status;

    private Paciente paciente;

    public Consulta(int dia, int mes, int ano, int hora, Paciente paciente) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
        this.paciente = paciente;
        this.status = 0;
    }

    public void mostrar() {
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + dia;
        result = prime * result + mes;
        result = prime * result + ano;
        result = prime * result + hora;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Consulta other = (Consulta) obj;
        if (dia != other.dia)
            return false;
        if (mes != other.mes)
            return false;
        if (ano != other.ano)
            return false;
        if (hora != other.hora)
            return false;
        return true;
    } 
}
