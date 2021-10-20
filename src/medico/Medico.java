
package medico;

import java.util.ArrayList;
import java.util.Date;

public class Medico extends User{
   
   
   private String speciality;
   
   public Medico (String name, String email){ 
       super(name, email);
       System.out.println("el nombre del doctor asignado es: " + name);
       System.out.println("******************************************************************");
       System.out.println("Su especialidad es: " + speciality);
       this.speciality=speciality;
   }
   //El array list lo utilizamos incrementar la lista y a crear nuevas citas
   ArrayList<AvailableAppointment> availableAppointment = new ArrayList<>();
   public void addAvailableAppointment(Date date, String time){
       availableAppointment.add(new AvailableAppointment (date,time));
   }

    @Override
    /*El metodo to super.ToString() nos ayudara a traer todo lo que contiene User en su metodo to string */
    public String toString() {
        return super.toString() + "\nSpeciality"; 
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

        @Override
        public String toString() {
            return "Available Apponitment \nDate: " + date + "\n Time: " + time;
        }
       
   }
}
