
package test;

import dominio.estudiante;
import java.util.Scanner;

public class Pnotas {
    
   static Scanner datos=new Scanner(System.in);
    public static void main (String[] args){
       
       Scanner in = new Scanner(System.in);
        int nombre, sexo, hombres, mujeres;
        double porcen_hombres, porcen_mujeres;
        String terepetir;
         hombres = 0;
        mujeres = 0;
        porcen_hombres = 0;
        porcen_mujeres = 0;
        do {
            System.out.println("Selecciona el valor de genero.");
            System.out.println("\t1.- Mujer");
            System.out.println("\t2.- Hombre");
            System.out.print("\t: ");
            do {
                sexo= in.nextInt();
                in.nextLine();
                if (sexo<1||sexo>2)
                    System.out.print("Valor incorrecto. Ingr\u00E9salo nuevamente.: ");
            } while (sexo<1||sexo>2);
            if(sexo==1)
                mujeres=mujeres+1;
            else
                hombres=hombres+1;
            System.out.println();
            do {
                System.out.print("\u00BFDeseas repetir el proceso? (S/N): ");
                terepetir = in.nextLine();
            } while (!terepetir.equalsIgnoreCase("s") && !terepetir.equalsIgnoreCase("n"));
        } while (terepetir.equalsIgnoreCase("s"));
       nombre=hombres+mujeres;
        if (nombre == 0) {
            porcen_hombres = 0;
        } else {
            porcen_hombres=100.0*hombres/nombre;
        }
        if (nombre == 0) {
            porcen_mujeres = 0;
        } else {
            porcen_mujeres=100.0*mujeres/nombre;
        }
        System.out.println("Valor de estudiantes: " + nombre);
        System.out.println("Valor de hombres: " + hombres);
        System.out.println("Valor de mujeres: " + mujeres);
        System.out.println("Valor de porcentaje hombres: " + porcen_hombres);
        System.out.println("Valor de porcentaje mujeres: " + porcen_mujeres);
    }
       
    
    }

   
    
}
