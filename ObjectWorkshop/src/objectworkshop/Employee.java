package objectworkshop;

/**
 * Representa la clase Empleado
 * @author Luis Ricardo Ortega
 */
public class Employee {
    /**
     * Atributos de la clase
     */
    private long id;
    public String name;
    public String job;
    protected int age;
    private double salary;

    /**
     * Constructor sin parametros para instanciar la clase
     */
    public Employee() {
    }

    /**
     * Constructor con parametros para instanciar la clase
     * @param id Identificacion del empleado
     * @param name Nombre del empleado
     * @param job Trabajo del empleado
     * @param age Edad del empleado
     * @param salary Salario del empleado
     */
    public Employee(long id, String name, String job, int age, double salary) {
        this.id = id;
        this.name = name;
        this.job = job;
        this.age = age;
        this.salary = salary;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    /**
     * Metodo para despedir al empleado
     * @return Devuelve un mensaje 
     */
    private String dismiss(){
        System.out.println("Empleado despedido");
        return "";
    }
    
}
