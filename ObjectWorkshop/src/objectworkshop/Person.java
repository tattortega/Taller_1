package objectworkshop;


import java.util.Date;
import java.util.Scanner;

/**
 * Representa la clase Persona
 * @author Luis Ricardo Ortega
 */
public class Person {
    
    /**
     * Atributos de la clase 
     */
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public int age;
    public float height;
    public float weight;
    private double id;
    public String genre;

    /**
     * Constructor sin parametros para instanciar la clase
     */
    public Person() {
    }

    
    /**
     * Constructor para instanciar la clase 
     * @param name Nombre de la persona
     * @param lastName1 Primer apellido de la persona
     * @param lastName2 Segundo apellido de la persona
     * @param dateBirth Fecha de nacimiento de la persona
     * @param height Altura de la persona
     * @param weight Peso de la persona
     * @param id Número de identificación de la persona
     * @param genre Género de la persona
     */
    public Person(String name, String lastName1, String lastName2, Date dateBirth, 
            float height, float weight, double id, String genre) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
        this.weight = weight;
        this.id = id;
        this.genre = genre;
    }
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    /**
     * Metodo para calcular el IMC 
     * @return El resultado de dividir peso entre altura elevado al cuadrado
     */
    public float calcularImc(){
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Peso(kgs): ");
        weight = consola.nextFloat();
        
        System.out.println("Altura(cms): ");
        height = consola.nextFloat();
        
        float imc = weight / ((height/100)*(height/100));
        
        if(imc < 18.5){
            System.out.println("Peso inferior al normal");
        }else if(imc <= 18.5 && imc <= 24.9){
            System.out.println("Peso normal");
        }else if(imc <= 25.0 && imc <= 30.0){
            System.out.println("Peso superior al normal");
        }else{
            System.out.println("Sobrepeso");
        }
        
        return imc;
    }
}
