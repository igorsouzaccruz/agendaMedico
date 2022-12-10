import javax.sound.sampled.UnsupportedAudioFileException;

import entities.Consulta;
import entities.Paciente;
import resources.Agenda;

public class App {
    public static void main(String[] args) throws Exception {
       
        Consulta consuta01 = new Consulta(0, 0, 0, 0, 
        null);

        Agenda agenda = new Agenda();
        

        System.out.println(agenda.disponibilidade(consuta01));
        


    }
}
