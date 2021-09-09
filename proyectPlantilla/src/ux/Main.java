package ux;

import aux.Func;
import aux.Validations;
import aux.listas;
import class_.Cliente;
import class_.Dispositivo;
import class_.Reporte;
import class_.Servicio;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static Servicio newOrden;
    public static Cliente newCliente;
    public static Dispositivo newdevice;
    public static Reporte newReporte;
    public static void showMain() {
        Scanner leer = new Scanner(System.in);
        listas list = new listas();
        try {
            while(true){
                System.out.println("------ MENU -----");
                System.out.println("1. NUEVA ORDEN "); // nueva orden -_-
                System.out.println("2. REPORTES"); // Orden - Dispositivo - idCliente - fecha - precioServicio
                System.out.println("3. REPUESTORIOS"); // ID - REPUESTORIO - FECHA
                System.out.println("4. BUSCAR ORDEN"); // POR : ID O FECHA
                System.out.println("5. VER TODAS LAS ORDENES");
                System.out.println("6. SALIR");

                int opc;
                opc = leer.nextInt();

                if(opc == 7){
                    break;
                }else{

                    switch (opc){
                        case  1:
                            newOrden = new Servicio();
                            String orden, idClienteO, idDispositivoO, fecha;
                            double  precioServicio;

                            while (true){
                                System.out.println("DIGITE LA ORDEN");
                                orden = leer.next();
                                if(Validations.validarNumeros(orden, 4)){
                                    newOrden.setOrden(orden);
                                    newOrden.setDate(LocalDate.now().toString());

                                    // ------------- CLIENTE ------------
                                    System.out.println("---------- DATOS CLIENTE ----------");
                                    newCliente = new Cliente();
                                    String name, surname,  document, telefono, idCliente;

                                    while (true){
                                        System.out.println("DIGITE EL NOMBRE DEL CLIENTE: ");
                                        name = leer.next();
                                        if(Validations.validarName(name) == "Nombre valido"){
                                            newCliente.setName(name);
                                            break;
                                        }else{
                                            System.out.println(Validations.validarName(name));
                                        }
                                    }

                                    while (true){
                                        System.out.println("DIGITE EL APELLIDO DEL CLIENTE: ");
                                        surname = leer.next();
                                        if(Validations.validarSurname(surname) == "apellido valido"){
                                            newCliente.setSurname(surname);
                                            break;
                                        }else{
                                            System.out.println(Validations.validarSurname(surname));
                                        }
                                    }

                                    while (true){
                                        System.out.println("DIGITE EL DOCUMENTO DEL CLIENTE: ");
                                        document = leer.next();
                                        if(Validations.validarDocument(document) == "Documento valido"){
                                            newCliente.setDocumet(document);
                                            break;
                                        }else{
                                            System.out.println(Validations.validarDocument(document));
                                        }
                                    }

                                    while (true){
                                        System.out.println("DIGITE EL TELEFONO DEL CLIENTE: ");
                                        telefono = leer.next();
                                        if(Validations.validarTelefono(telefono) == "telefono valido"){
                                            newCliente.setPhoneNumber(telefono);
                                            break;
                                        }else{
                                            System.out.println(Validations.validarTelefono(telefono));
                                        }
                                    }

                                    while (true){
                                        System.out.println("DIGITE EL ID DEL CLIENTE: ");
                                        idCliente = leer.next();
                                        if(Validations.validarIdes(idCliente, "5") == "ID valido"){
                                            newCliente.setIdCliente(idCliente);
                                            break;
                                        }else{
                                            System.out.println(Validations.validarIdes(idCliente, "5"));
                                        }
                                    }

                                    //

                                    // ---------------DISPOSITIVO ----------
                                    System.out.println("---------- DATOS DISPOSITIVO ----------");
                                    newdevice = new Dispositivo();
                                    String idDevice, modelo, mark, imei, password, failure;
                                    int state;


                                    while (true){
                                        System.out.println("DIGITE EL ID DEL DISPOSITIVO: ");
                                        idDevice = leer.next();
                                        if(Validations.validarIdes(idDevice, "5") == "ID valido"){
                                            newdevice.setIdDevice(idDevice);
                                            newOrden.setIdDispositivo(idDevice);
                                            break;
                                        }else{
                                            System.out.println(Validations.validarIdes(idDevice, "5"));
                                        }
                                    }

                                    while (true){
                                        System.out.println("DIGITE LA MARCA DEL DISDPOSITIVO: ");
                                        mark = leer.next();
                                        if(Validations.validarCadena(mark, 25)){
                                            newdevice.setMark(mark);
                                            break;
                                        }else{
                                            System.out.println("Marca invalida");
                                        }
                                    }


                                    while (true){
                                        System.out.println("DIGITE EL MODELO DEL DISPOSITIVO: ");
                                        modelo = leer.next();
                                        if(Validations.validarCadena(modelo, 25)){
                                            newdevice.setModelo(modelo);
                                            break;
                                        }else{
                                            System.out.println("Modelo invalido");
                                        }
                                    }




                                    while (true){
                                        System.out.println("DIGITE EL IMEI DEL DISPOSITIVO: ");
                                        imei = leer.next();
                                        if(Validations.validarNumeros(imei, 15)){
                                            newdevice.setImei(imei);
                                            break;
                                        }else{
                                            System.out.println("Imei invalida");
                                        }
                                    }

                                    while (true){
                                        System.out.println("DIGITE LA CONTRASEÑA DEL DISDPOSITIVO: ");
                                        password = leer.next();
                                        if(Validations.validarCadena(password, 16)){
                                            newdevice.setPassword(password);
                                            break;
                                        }else{
                                            System.out.println("Contraseña invalida");
                                        }
                                    }

                                    while (true){
                                        System.out.println("DIGITE LA FALLA DEL DISDPOSITIVO: ");
                                        failure = leer.next();
                                        if(Validations.validarCadena(failure, 100)){
                                            newdevice.setFailure(failure);
                                            break;
                                        }else{
                                            System.out.println("Maximo 100 caracteres, Sea concreto");
                                        }
                                    }

                                    System.out.println("DIGITE EL ESTADO DEL DISPOSITIVO 1. REPERADO\n2.EN REPARACION\n3. ENTREGADO ");
                                    while (true){
                                        state = leer.nextInt();
                                        if(Validations.validarSate(state) == 1){
                                            newdevice.setState("REPARADO");
                                            break;
                                        }else if(Validations.validarSate(state) == 2){
                                            newdevice.setState("EN REPARACION");
                                            break;
                                        }else if(Validations.validarSate(state) == 3){
                                            newdevice.setState("ENTREGADO");
                                            break;
                                        }else{
                                            System.out.println("ESTADO NO VALIDO");
                                        }
                                    }


                                    System.out.println("\n \n");
                                    System.out.println("DIGITE EL PRECIO DEL SERVICIO");
                                    precioServicio = leer.nextDouble();
                                    newOrden.setPrecioServicio(precioServicio);


                                    String aux = newCliente.getIdCliente();
                                    newOrden.setIdCliente(aux);

                                    list.dispositivos.add(newdevice);
                                    list.servicios.add(newOrden);




                                    // ----------------------------------
                                    break;
                                }else{
                                    System.out.println("ORDEN INVALIDA");
                                }
                            }


                            System.out.println("CREAR CLIENTE ");
                            System.out.println("CREAR DISPOSITIVO ");
                            break;
                        case  2:
                            System.out.println("REPORTES - Orden - Dispositivo - idCliente - fecha - precioServicio");
                            newReporte = new Reporte();
                            // Orden - Dispositivo - idCliente - fecha - precio
                            for(int i = 0; i<list.servicios.size(); i++){
                                if(Objects.equals((list.servicios.get(i).getIdDispositivo()), (list.dispositivos.get(i).getIdDevice()))){
                                    list.reportes.get(i).setDateReport(list.servicios.get(i).getDate());
                                    list.reportes.get(i).setClienteID(list.servicios.get(i).getIdCliente());
                                    list.reportes.get(i).setDeviceModel(list.dispositivos.get(i).getModelo());
                                    list.reportes.get(i).setNumOrden(list.servicios.get(i).getOrden());
                                    list.reportes.get(i).setPrecio(list.servicios.get(i).getPrecioServicio());
                                }

                                list.reportes.add(newReporte);
                                break;
                            }

                            int aux;
                            list.reportes.forEach((n) -> System.out.println(n.toString()));

                            System.out.println("Ordenar por precio 1. SI 2. NO: ");
                            aux = leer.nextInt();
                            if(aux == 1){
                                Func.sortArray(list.reportes);
                            }else{
                                break;
                            }


                            break;
                        case  3:
                            System.out.println("3");
                            break;
                        case  4:
                            try {
                                while (true){
                                    System.out.println("Buscar orden 1. Por ID \n2. Por Fecha\n3. Salir");
                                    int opcl;
                                    String aux2;
                                    opcl = leer.nextInt();

                                    if(opcl == 3){
                                        showMain();
                                        break;
                                    }else if(opcl == 1){
                                        System.out.println("Digite el id a buscar: ");
                                        aux2 = leer.next();
                                        System.out.println("----- RESULTADO ----");
                                        for (int i = 0; i<list.servicios.size(); i++){
                                            if(list.servicios.get(i).getIdService() == aux2){
                                                System.out.println(list.servicios.get(i));
                                            }
                                        }
                                    }else if(opcl    == 2){
                                        System.out.println("Digite la fecha buscar (YYYY-MM-DD): ");
                                        aux2 = leer.next();
                                        System.out.println("----- RESULTADO -----");
                                        for(int i=0; i<list.servicios.size(); i++){
                                            if(Objects.equals(aux2, list.servicios.get(i).getDate())){
                                                System.out.println(list.servicios.get(i));
                                            }else{
                                                System.out.println("FECHA INCORRECTA O NO EXISTE");
                                                break;
                                            }
                                        }

                                    }
                                }
                            }catch (Exception e) {
                                System.out.println("Error: "+e);
                            }
                            break;
                        case  5:
                            System.out.println("------ ORDENES REGISTRADAS -------");
                            for(int i = 0; i<list.servicios.size(); i++){
                                System.out.println(list.servicios.get(i));
                            }
                            System.out.println("");
                            System.out.println("Total: "+list.servicios.size());
                            break;
                        default:
                            System.out.println("Opcion  invalidad");
                            break;

                    }
                } // fin if

            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
            showMain();
        }

    }

}


