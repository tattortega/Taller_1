package objectworkshop;

import java.util.ArrayList;

/**
 * Representa la clase Fruta
 * @author Luis Ricardo Ortega
 */
public class Fruit {
    
    /**
     * Atributos de la clase 
     */
    public String name;
    private float averageWeight;
    public ArrayList colors;
    protected String flavor;

    /**
     * Constructor sin parametros para instanciar la clase
     */
    public Fruit() {
    }

    /**
     * Constructor para instanciar la clase
     * @param name Nombre de la fruta
     * @param averageWeight Peso promedio
     * @param colors Color de la fruta
     * @param flavor Sabor de la fruta
     */
    public Fruit(String name, float averageWeight, ArrayList colors, String flavor) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
        this.flavor = flavor;
    }

    public ArrayList getColors() {
        return colors;
    }

    public void setColors(ArrayList colors) {
        this.colors = colors;
    }

    /**
     * Metodo para comer la fruta
    * @return Devuelve un estado verdadero
    */
    public boolean eat(){
        System.out.println("Comer fruta");
        return true;
    }
    
     
}
