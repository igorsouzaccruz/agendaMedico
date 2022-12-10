import entities.Consulta;
import resources.Agenda;

public class App {
    public static void main(String[] args) throws Exception {
       
        try {
            Consulta consuta01 = new Consulta(0, 0, 0, 0, null);
            Consulta consuta02 = new Consulta(0, 0, 0, 0, null);

            Agenda agenda = new Agenda();

            agenda.adicionar(consuta01);
            agenda.adicionar(consuta02);

        } catch (Exception e) {
            System.out.println(e);
        }


        

    }
}
