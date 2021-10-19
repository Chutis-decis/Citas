package medico;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Medico medico = new Medico ("Luis Alfredo Garcia Sandoval","Pediatra");
        medico.addAvailableAppointment(new Date (),"5pm");
        medico.addAvailableAppointment(new Date (),"7pm");
        medico.addAvailableAppointment(new Date (),"12am");
        
        
        
        for(Medico.AvailableAppointment aA: medico.getAvailableAppointments()){
            System.out.println(aA.getDate() + " " + aA.getTime());
        }
    }
}
