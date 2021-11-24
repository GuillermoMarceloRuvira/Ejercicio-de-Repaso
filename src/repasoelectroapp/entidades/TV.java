
package repasoelectroapp.entidades;

import java.util.Scanner;


public class TV extends Electro{
    
    private Scanner leer= new Scanner(System.in).useDelimiter("\n");
    
     
    private Integer resolucion;
    private Boolean sintonizador;
    private String smarttv;
    private String tresD;
    private String curvo;

    public TV(Integer resolucion, Boolean sintonizador) {
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public TV(Integer resolucion, Boolean sintonizador, Double precio, String color, char consumo, Integer peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public TV() {
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(Boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    @Override
    public String toString() {
        return "TV{" + "resolucion=" + resolucion + ", sintonizador=" + sintonizador + '}';
    }
    public void crearTV() {
        super.crearelectro();
        System.out.println("ingrese resolucion");
        this.resolucion = leer.nextInt();
        System.out.println("diga si tiene sintonizador");
        char respuesta = leer.next().charAt(0);
        if (respuesta == 's') {
            this.sintonizador = true;
        } else {
            this.sintonizador = false;
        }
    }
    public void mostrarTV(){
        super.mostrar();
        System.out.println("la resolucion es de: " + resolucion + " pulgadas");
        System.out.println("sintonizador: " + sintonizador);
    }
}
