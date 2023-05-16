package InterfacesFuncionales.Consumer.Function;

public class Cliente {
    private String nombre;
    private String apellido;
    private int edad;
    private double saldo;

    public Cliente(String nombre,String apellido,int edad,double saldo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.saldo = saldo;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
