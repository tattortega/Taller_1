package objectworkshop;

import java.util.Scanner;

/**
 * Representa la clse producto
 * @author Luis Ricardo Ortega
 */
public class Product {
    /**
     * Atributos de la clase
     */
    public String brand;
    public String name;
    public String expirationDate;
    private String reference;
    protected double price;

    /**
     * Constructor sin parametros para instanciar la clase
     */
    public Product() {
    }

    /**
     * Constructor sin parametros para instanciar la clase
     * @param brand Marca del producto
     * @param name Nombre del producto
     * @param expirationDate Fecha de vencimiento del producto
     * @param reference Referencia del producto
     * @param price Precio del producto
     */
    public Product(String brand, String name, String expirationDate, String reference, double price) {
        this.brand = brand;
        this.name = name;
        this.expirationDate = expirationDate;
        this.reference = reference;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    /**
     * Metodo para calcular el iva del producto
     * @param price Precio del producto
     * @return Resultado de multiplicar el precio por el porcentaje del iva
     */
    public double calculateIva(){
        Scanner consola = new Scanner(System.in);        
        System.out.println("Precio del producto: ");
        price = consola.nextDouble();
        double iva = this.price * 0.19;
        System.out.println("Iva: "+iva);
        
        return iva;
    }
    
}
