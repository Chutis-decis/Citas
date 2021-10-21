package ui;

import model.Pattient;
import model.Medico;
import java.util.Date;
import model.AppointmentDoctor;
import model.ISchedulable;
import model.Nurse;
import model.User;

public class Main {
    public static void main(String[] args) {
       /* Medico medico = new Medico ("Luis Alfredo","h@dtls.com");
        medico.addAvailableAppointment(new Date (),"5pm");
        medico.addAvailableAppointment(new Date (),"7pm");
        medico.addAvailableAppointment(new Date (),"12am");*/
        
        
        
        //System.out.println(medico);
        
        
        //Pattient paciente = new Pattient("Pedro Gomez Garza","p@p.bot.mx");
        
        
        
        /*for(Medico.AvailableAppointment aA: medico.getAvailableAppointments()){
            System.out.println(aA.getDate() + " " + aA.getTime());
        }*/
        
        User user = new Medico("Luis Alfredo Garcia Sandoval" , "ch@ht.com");
        /*Se tiene que mandar a traer User asi de esta foema debido a que la clase 
        es abstracta y no se puede mandar a traer una clase abstracta como un objeto 
        por eso mandamos a traer el constructo o la instancia de Medico en este caso*/
        user.showDataUser(); 
        
        User user2 = new Pattient("Juan Sanchez", "juan@juan.com");
        user2.showDataUser();
        
        User user3 = new Nurse("Valeria Garcia","vale@cla.com");
        user3.showDataUser();
        
        ISchedulable iSchedulable = new AppointmentDoctor();
        /*Esta clase la cual es la de la interfaz y la clase de abstraccion 
        se pueden mandar a traer */
        //iSchedulable.schedule(34/02/02, "5pm");
        
        ISchedulable is = new ISchedulable(){//clase Anónimas
            @Override
            public void schedule(Date date, String time) {
                System.out.println("interfaz");
            }
            
        };
    }
}
