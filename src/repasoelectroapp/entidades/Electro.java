
package repasoelectroapp.entidades;

import java.util.Scanner;


public class Electro {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    protected Double precio;
    protected String color;
    protected char consumo;
    protected Integer peso;

    public Electro() {
    }

    public Electro(Double precio, String color, char consumo, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electro{" + "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }
    
    public Electro crearelectro(){
        System.out.println("ingrese un precio");
        this. precio= leer.nextDouble();
        System.out.println("ingrese color");
        this. color = leer.next();
        validarcolor(color);
        System.out.println("ingrese consumo");
        this. consumo= leer.next().charAt(0);
        validarconsumo(consumo);
        System.out.println("ingrese el peso");
        this. peso= leer.nextInt();
        Electro nuevoelectro= new Electro(precio, color, consumo, peso);
        return nuevoelectro;
    }
    public void mostrar(){
        System.out.println("el precio es: " + precio);
        System.out.println("el color es: " + color);
        System.out.println("el consumo es: " + consumo);
        System.out.println("el peso es: " + peso);
    }
    public void validarconsumo(char consumo){
        
        if(consumo=='a'|| consumo=='b'|| consumo=='c'|| consumo=='d'|| consumo=='e'||consumo=='f'){
            this.consumo= consumo;
        }else{
            this.consumo= 'f';
        }
    }
    public void validarcolor(String color){
        if(color.equals("negro")||color.equals("gris")||color.equals("blanco")){
            this.color = color;
        }else{
            this.color="gris";
        }
    }
}
