
package repasoelectroapp;

import java.util.ArrayList;
import java.util.Scanner;
import repasoelectroapp.entidades.Electro;
import repasoelectroapp.entidades.Lavadora;
import repasoelectroapp.entidades.TV;


public class RepasoElectroAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in).useDelimiter("\n");
        ArrayList<Electro> listadetodo= new ArrayList();
        Electro electro1 = new Electro();
        electro1.crearelectro();
        System.out.println(electro1);
        Lavadora lavadora1= new Lavadora();
        lavadora1.crearLavadora();
        System.out.println("---------LAVADORA---------");
        lavadora1.mostrarlavadora();
        TV tv1= new TV();
        tv1.crearTV();
        System.out.println("--------------TV---------");
        tv1.mostrarTV();
        listadetodo.add(electro1);
        listadetodo.add(lavadora1);
        listadetodo.add(tv1);
        for (Electro aux : listadetodo) {
             aux.mostrar();
        }
    }
    
}
