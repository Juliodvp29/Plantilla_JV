package class_;

public class Reporte {
    //Orden - Dispositivo - idCliente - fecha - precio
    public String numOrden;
    public String deviceModel;
    public String clienteID;
    public String dateReport;
    public double precio;

    public Reporte() {

    }

    public Reporte(String numOrden, String deviceModel, String clienteID, String dateReport, Double precio) {
        this.numOrden = numOrden;
        this.deviceModel = deviceModel;
        this.clienteID = clienteID;
        this.dateReport = dateReport;
        this.precio = precio;
    }

    public String getNumOrden() {
        return numOrden;
    }

    public void setNumOrden(String numOrden) {
        this.numOrden = numOrden;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getClienteID() {
        return clienteID;
    }

    public void setClienteID(String clienteID) {
        this.clienteID = clienteID;
    }

    public String getDateReport() {
        return dateReport;
    }

    public void setDateReport(String dateReport) {
        this.dateReport = dateReport;
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Reporte{" +
                "numOrden='" + numOrden + '\'' +
                ", deviceModel='" + deviceModel + '\'' +
                ", clienteID='" + clienteID + '\'' +
                ", dateReport='" + dateReport + '\'' +
                ", precio='" + precio + '\'' +
                '}';
    }
}
