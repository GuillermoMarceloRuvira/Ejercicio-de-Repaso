
package repasoelectroapp.entidades;

import java.util.Scanner;


public class Lavadora extends Electro{
    
    private Scanner leer=new Scanner(System.in).useDelimiter("\n");
    
    private Integer carga;

    public Lavadora(Integer carga) {
        this.carga = carga;
    }

    public Lavadora(Integer carga, Double precio, String color, char consumo, Integer peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public Lavadora() {
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + '}';
    }

   public void crearLavadora(){
       super.crearelectro();
       System.out.println("ingrese cuanto carga");
       this.carga = leer.nextInt();
   }
   public void mostrarlavadora(){
       super.mostrar();
       System.out.println("la lavadora carga: " + carga);
   }
           
           
           
           
           
   

   
    
}
