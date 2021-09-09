package ux;

import aux.Validations;
import aux.listas;
import class_.Empleado;

import java.util.Objects;
import java.util.Scanner;

public class Login {
    public static Empleado newEmpleado;
    public static void  login(){
        Scanner leer = new Scanner(System.in);
        listas list = new listas();
        try{

            int opc;
            while (true){
                System.out.println("1. Ingresar\n2. Registrarse\n3. Salir");
                opc = leer.nextInt();

                if(opc == 3){
                    break;
                }else if(opc == 2){
                    System.out.println("------------------ REGISTRAR NUEVO USUARIO ------------------\n");
                    newEmpleado = new Empleado();
                    String name, surname, document, telefono, idEmpleado, direccion, password, aux;



                    while (true){
                        System.out.println("DIGITE EL ID DEL EMPLEADO: ");
                        idEmpleado = leer.next();
                        if(Validations.validarIdes(idEmpleado, "5") == "ID valido"){
                            //2
                            if(Validations.existeEmpleado(list.empleados,idEmpleado)){
                                System.out.println("Ya existe un usuario con este ID");
                            }else{
                                newEmpleado.setIdEmpleado(idEmpleado);
                                break;
                            }
                        }else{
                            System.out.println(Validations.validarIdes(idEmpleado, "5"));
                        }
                    }

                    while (true){
                        System.out.println("DIGITE EL NOMBRE DEL EMPLEADO: ");
                        name = leer.next();
                        if(Validations.validarName(name) == "Nombre valido"){
                            newEmpleado.setName(name);
                            break;
                        }else{
                            System.out.println(Validations.validarName(name));
                        }
                    }

                    while (true){
                        System.out.println("DIGITE EL APELLIDO DEL EMPLEADO: ");
                        surname = leer.next();
                        if(Validations.validarSurname(surname) == "apellido valido"){
                            newEmpleado.setSurname(surname);
                            break;
                        }else{
                            System.out.println(Validations.validarSurname(surname));
                        }
                    }


                    while (true){
                        System.out.println("DIGITE EL DOCUMENTO DEL EMPLEADO: ");
                        document = leer.next();
                        if(Validations.validarDocument(document) == "Documento valido"){
                            newEmpleado.setDocumet(document);
                            break;
                        }else{
                            System.out.println(Validations.validarDocument(document));
                        }
                    }


                    while (true){
                        System.out.println("DIGITE EL TELEFONO DEL EMPLEADO: ");
                        telefono = leer.next();
                        if(Validations.validarTelefono(telefono) == "telefono valido"){
                            newEmpleado.setPhoneNumber(telefono);
                            break;
                        }else{
                            System.out.println(Validations.validarTelefono(telefono));
                        }
                    }



                    while (true){
                        System.out.println("DIGITE LA DIRECCION DEL EMPLEADO: ");
                        direccion = leer.next();
                        if(Validations.validarCadena(direccion, 10)){
                            //3
                            newEmpleado.setDireccion(direccion);
                            break;
                        }else{
                            System.out.println("Direccion no valida");
                        }
                    }



                    while (true){
                        System.out.println("DIGITE lA CONTRASEÑA DEL EMPLEADO: ");
                        password = leer.next();
                        if(Validations.validarPassword(password)){
                            do{
                                System.out.println("CONFIRME LA CONTRASEÑA: ");
                                aux = leer.next();
                                if(Objects.equals(aux, password)){
                                    System.out.println("Correcta \n \n \n \nUsuario Registrao con exito :D");
                                    newEmpleado.setPassword(password);
                                    // Add a empleado to list
                                    list.empleados.add(newEmpleado);
                                    break;
                                }else{
                                    System.out.println("incorrecto");
                                }
                            }while (true);
                            break;
                        }else{
                            System.out.println("Contraseña incorrecta (debe tener entre 8 y 16 caracteres 1 mayuscula 1 minuscula puede tener otros simbolos)");
                        }

                    }



                   // list.empleados.forEach((n) -> System.out.println(n.toString()));

                    //---------------------------------------------------------------------------------
                }else if(opc == 1){
                    String name, password, aux;
                    int cont;
                    System.out.println("INGRESE AL SISMTEMA\n");

                    while (true){
                        System.out.println("INGRESE SU NOMBRE");
                        name = leer.next();
                        if(Validations.validarName(name) == "Nombre valido"){
                            if(Validations.existeEmpleadoName(list.empleados, name)){
                                while (true){
                                    System.out.println("INGRESE SU CONTRASEÑA");
                                    password = leer.next();
                                    if(Validations.validarPassword(password)){
                                        do{
                                            System.out.println("CONFIRME LA CONTRASEÑA: ");
                                            aux = leer.next();
                                            if(Objects.equals(aux, password)){
                                                //Objects.equals((list.empleados.get(i)), password)
                                                if(list.empleados.contains(newEmpleado)){
                                                    System.out.println("Usuario encontrado \n \n \n");
                                                    Main.showMain();
                                                    break;
                                                }else{
                                                    System.out.println("el usuario no existe \n \n \n");
                                                    login();
                                                }

                                                break;
                                            }else{
                                                System.out.println("incorrecto");
                                            }
                                        }while (true);
                                        break;
                                    }else{
                                        System.out.println("Contraseña incorrecta (debe tener entre 8 y 16 caracteres 1 mayuscula 1 minuscula puede tener otros simbolos)");
                                    }

                                }
                                break;
                            }else{
                                System.out.println("No existe un empleado con este nombre 1. continuar - 2. Salir");
                                cont = leer.nextInt();
                                if(cont==2){
                                    break;
                                }else{

                                    while (true){
                                        System.out.println("INGRESE SU CONTRASEÑA");
                                        password = leer.next();
                                        if(Validations.validarPassword(password)){
                                        do{
                                                System.out.println("CONFIRME LA CONTRASEÑA: ");
                                                aux = leer.next();
                                                if(Objects.equals(aux, password)){
                                                    //Objects.equals((list.empleados.get(i)), password)
                                                    if(list.empleados.contains(newEmpleado)){
                                                        System.out.println("Usuario encontrado \n \n \n");
                                                        Main.showMain();
                                                        break;
                                                    }else{
                                                        System.out.println("el usuario no existe \n \n \n");
                                                        login();
                                                    }

                                                    break;
                                                }else{
                                                    System.out.println("incorrecto");
                                                }
                                            }while (true);
                                            break;
                                        }else{
                                            System.out.println("Contraseña incorrecta (debe tener entre 8 y 16 caracteres 1 mayuscula 1 minuscula puede tener otros simbolos)");
                                        }

                                    }
                                }
                            }
                           break;
                        }else{
                            System.out.println(Validations.validarName(name));
                        }
                    }

                }else{
                    System.out.println("Opcion no validad");
                }

            }
        }catch (Exception e){
            System.out.println("el dato digitado no es valido\n");
            login();
        }

    }
}
