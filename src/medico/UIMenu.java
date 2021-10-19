package medico;

import java.util.Scanner;

public class UIMenu {
    
    public static final String[] MONTS ={"Enero", "Febrero", "Marzo", "April","Mayo", "Junio",
                                   "Julio","Agorsto","Septiembre","October","November","December"};
    
    static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opcion deseada");
        
        int response;
        do{
            System.out.println("    1. Doctor");
            System.out.println("    2. Patient");
            System.out.println("    0. Return");
            
            Scanner sc = new Scanner (System.in);
            response = Integer.valueOf(sc.nextInt());
            
            switch(response){
                case 1:
                    System.out.println("Doctor");
                    break;
                case 2:
                    response=0;
                    showPatientMenu();
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while(response !=0);
        
    }
    public static void showPatientMenu(){
        int response = 0;
        
        do{
            System.out.println("\n\n");
            System.out.println("Pattient");
            System.out.println("    1. Book an appoinment");
            System.out.println("    2. My Appoinment");
            System.out.println("    0. Return");
            
            Scanner sc = new Scanner (System.in);
            response = Integer.valueOf(sc.nextInt());
            
            switch (response){
                case 1:
                    System.out.println("::Book an appoinment");
                    for (int i = 0; i < 3; i++) {
                        System.out.println(i + ". " + MONTS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My Appoinment");
                case 0:
                    showMenu();
                    break;
        }
        }while (response !=0);
    }
}
