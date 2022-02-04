package objectworkshop;

import java.util.Scanner;

/**
 * Representa la clase Vendedor
 * @author Luis Ricardo Ortega
 */
public class Seller {
    /**
     * Atributos de la clase
     */
    private long id;
    public String name;
    public int typeSeller;
    protected double sales;

    /**
     * Constructor sin parametros para instanciar la clase
     */
    public Seller() {
    }

    /**
     * Constructor con parametros para instanciar la clase
     * @param id Identificacion del vendedor
     * @param name Nombre del vendedor
     * @param typeSeller Tipo de vendedor
     * @param sales Ventas 
     */
    public Seller(long id, String name, int typeSeller, double sales) {
        this.id = id;
        this.name = name;
        this.typeSeller = typeSeller;
        this.sales = sales;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTypeSeller() {
        return typeSeller;
    }

    public void setTypeSeller(int typeSeller) {
        this.typeSeller = typeSeller;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }
    
    /**
     * Metodo para calcular comisiones depende del tipo de vendedor
     * @return El valor de la comision
     */
    protected double calcular_comision(){
        Scanner consola = new Scanner(System.in);
        double commission;
        
        System.out.println("Tipo de vendedor(1=Puerta a Puerta,2=Telemercadeo): ");
        typeSeller = consola.nextInt(); 
        System.out.println("Ventas del mes: ");
        sales = consola.nextDouble();
        
        if(typeSeller == 1){
            commission = sales * 0.25;
        }
        else{
            commission = sales * 0.20;
        }
        System.out.println("Comisiones: "+commission);
        
        return commission;
    }
}
