package aux;

import class_.Dispositivo;
import class_.Empleado;
import class_.Reporte;
import class_.Servicio;

import java.util.ArrayList;

public class listas {
    public ArrayList<Empleado> empleados = new ArrayList<>();
    public ArrayList<Dispositivo> dispositivos = new ArrayList<>();
    public ArrayList<Servicio> servicios = new ArrayList<>();
    public ArrayList<Reporte> reportes = new ArrayList<Reporte>();

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setDispositivos(ArrayList<Dispositivo> dispositivos) {
        this.dispositivos = dispositivos;
    }

    public void setServicios(ArrayList<Servicio> servicios) {
        this.servicios = servicios;
    }
}
