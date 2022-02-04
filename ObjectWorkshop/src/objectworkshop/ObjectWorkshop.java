package objectworkshop;

/**
 * Representa la clase principal
 * @author Luis Ricardo Ortega
 */

public class ObjectWorkshop {
    
    
    public static void main(String[] args) {
        
        /**
         * Instanciar la clase Person e invocar el metodo calcular IMC
         */
        Person young = new Person();
        young.calcularImc();
        
        /**
         * Instanciar la clase Fruit e invocar el metodo comer 
         */
        Fruit apple = new Fruit();
        apple.eat();
        
        /**
         * Instanciar la clase BankAccount e invocar el metodo calcular intereses
         */
        BankAccount bancolombia = new BankAccount();
        bancolombia.calculateInterest();
        
        /**
         * Instanciar la clase Product e invocar el metodo calcular iva
         */
        Product ariel = new Product();
        ariel.calculateIva();
        
        /**
         * Instanciar la clase Employee y acceder al salario del empleado
         */
        Employee secretary = new Employee();
        secretary.getSalary();
        
        /**
         * Instanciar la clase Seller e invocar el metodo calcular comisiones
         */
        Seller telemarketing = new Seller();
        telemarketing.calcular_comision();
                
    }

}

