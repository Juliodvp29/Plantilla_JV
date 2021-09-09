package class_;


import java.time.LocalDate;
import java.util.Date;

public class Servicio {
    private static String idService;
    private String orden;
    private String date;
    private String idCliente;
    private String idDispositivo;
    private Double precioServicio;

    public Servicio() {
        idService+=1;
    }

    public Servicio(String idService, String orden, String date, String idCliente, String idDispositivo, Double precioServicio) {
        this.idService = idService;
        this.orden = orden;
        this.date = date;
        this.idCliente = idCliente;
        this.idDispositivo = idDispositivo;
        this.precioServicio = precioServicio;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getIdDispositivo() {
        return idDispositivo;
    }

    public void setIdDispositivo(String idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    public Double getPrecioServicio() {
        return precioServicio;
    }

    public void setPrecioServicio(Double precioServicio) {
        this.precioServicio = precioServicio;
    }

    @Override
    public String toString() {
        return "Servicio{" +
                "idService='" + idService + '\'' +
                ", order='" + orden + '\'' +
                ", date=" + date +
                ", idCliente='" + idCliente + '\'' +
                ", idDispositivo='" + idDispositivo + '\'' +
                ", PrecioServicio='" + precioServicio + '\'' +
        '}';
    }


    // this methodo register a new order not existent order to the list
    public void registerOrder(Cliente customer, Dispositivo device){

    }
}
