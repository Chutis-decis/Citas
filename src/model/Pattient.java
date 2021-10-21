package model;

public class Pattient extends User{
    
    private String birthday;
    private double weight;
    private double height;
    private String blood;
    
    public Pattient(String name, String email){
        super (name,email);
        System.out.println("El nombre del paciente es: " + name);
        System.out.println("Su correo electronico es: " + email);
    }
    
    public void setWeight(double weight){
        this.weight=weight;
    }
    public String getWeight(){
        return this.weight + " Kg";
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getHeight() {
        return this.height + "Mts";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {//ToString proviene de la clase Object 
        return super.toString() + "\nAge: " + birthday + "\n Weight: " +getWeight()
                + "\n Height: " + getHeight() + "\n Blood " +blood; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showDataUser() {
        
        System.out.println("Historial completo desde el nacimiento\n");
    }
    
}


