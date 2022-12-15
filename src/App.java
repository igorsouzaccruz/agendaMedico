import entities.Consulta;
import entities.Paciente;
import resources.Agenda;

public class App {
    public static void main(String[] args) {

        try {

            Paciente paciente2 = new Paciente("Igor","Cruz", "050","666");
            Paciente paciente1 = new Paciente("Lucas","Blibli", "0451","666");
            
            Consulta consulta1 = new Consulta(0, 0, 0, 1, paciente1);
            Consulta consulta2 = new Consulta(0, 0, 0, 2, paciente2);
            Consulta consulta3 = new Consulta(0, 0, 0, 3, paciente1);

            Agenda agenda = new Agenda();

            agenda.adicionar(consulta1);
            agenda.confirmar(consulta1);
            agenda.realizar(consulta1);

            System.out.println("===========");

            agenda.adicionar(consulta2);
            agenda.confirmar(consulta2);
            agenda.cancelar(consulta2);

            System.out.println("===========");

            agenda.adicionar(consulta3);
            agenda.confirmar(consulta3);

            System.out.println("============");

            agenda.listar(0,0,0);

            System.out.println("============");

            agenda.pesquisar("xxx");


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}