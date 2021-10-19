
package medico;

import java.util.ArrayList;
import java.util.Date;

public class Medico {
   static int id = 0; /*Cuando declara una variable static 
   tiene que ir incrementado o decrementando la variable 
   cada vez que la mande a traer el constructor*/
   private String name;
   private String speciality;
   
   
   public Medico (){//Metodo constructor
       System.out.println("Construyendo el objeto Doctor");
   }
   public Medico (String name, String speciality){ 
       System.out.println("el nombre del doctor asignado es: " + name);
       System.out.println("******************************************************************");
       System.out.println("Su especialidad es: " + speciality);
       id++;
       this.name=name;
       this.speciality=speciality;
       
   }
   //Comportamientos 
   public void showName(){
       System.out.println("Luis Alfredo Garcia Sandoval");
   }
   public void showId(){
       System.out.println("ID Doctor " + id + "\n");
   }
   //El array list lo utilizamos incrementar la lista y a crear nuevas citas
   ArrayList<AvailableAppointment> availableAppointment = new ArrayList<>();
   public void addAvailableAppointment(Date date, String time){
       availableAppointment.add(new AvailableAppointment (date,time));
   }
   //Esta nos ayuda a devolver la lista completa de citas
   public ArrayList<AvailableAppointment> getAvailableAppointments(){
       return availableAppointment;
   }
   public static class AvailableAppointment{
       private int id ;
       private Date date;
       private String time;
       
       public AvailableAppointment (Date date, String time){
           this.date=date;
           this.time=time;
       }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
       
   }
}
