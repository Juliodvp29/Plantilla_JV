package class_;

public class Empleado extends Persona{

    private String idEmpleado;
    private String direccion;
    private String password;


    public Empleado(){

    }

    public Empleado(String idEmpleado, String direccion) {
        this.idEmpleado = idEmpleado;
        this.direccion = direccion;
    }

    public Empleado(String name, String surname, String documet, String phoneNumber, String idEmpleado, String direccion, String password) {
        super(name, surname, documet, phoneNumber);
        this.idEmpleado = idEmpleado;
        this.direccion = direccion;
        this.password = password;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado='" + idEmpleado + '\'' +
                ", direccion='" + direccion + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
