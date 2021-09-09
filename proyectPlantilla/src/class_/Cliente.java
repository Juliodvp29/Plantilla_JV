package class_;


public class Cliente extends Persona{
    private String idCliente;


    public Cliente(){

    }

    public Cliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public Cliente(String name, String surname, String documet, String phoneNumber, String idCliente) {
        super(name, surname, documet, phoneNumber);
        this.idCliente = idCliente;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }
}