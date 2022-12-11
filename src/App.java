import entities.Consulta;
import resources.Agenda;

public class App {
    public static void main(String[] args) throws Exception {
       
        try {
            Consulta consuta01 = new Consulta(0, 0, 0, 0, null);
            Consulta consuta02 = new Consulta(0, 0, 0, 0, null);
            Consulta consuta03 = new Consulta(0, 0, 0, 0, null);
          
            Agenda agenda = new Agenda();

            agenda.adicionar(consuta01);
            System.out.println(consuta01.getStatus());

            agenda.realizar(consuta01);
            System.out.println(consuta01.getStatus());

            agenda.adicionar(consuta02);
            System.out.println(consuta02.getStatus());

            agenda.realizar(consuta02);
            System.out.println(consuta02.getStatus());

            agenda.adicionar(consuta03);
            System.out.println(consuta03.getStatus());

            agenda.realizar(consuta03);
            System.out.println(consuta03.getStatus());

        } catch (Exception e) {
            System.out.println(e);
        }


        

    }
}
