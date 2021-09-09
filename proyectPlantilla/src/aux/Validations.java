package aux;

import class_.Empleado;

import java.util.ArrayList;
import java.util.Objects;

public class Validations {
    // String > funciona :()
    public static boolean validarCadena(String cadena, int longitud){
        boolean respuesta = true;
        cadena.toLowerCase();
        if(cadena.matches("/^[a-zA-z0-9\\s]*/")){
            respuesta = true; // Cadena valida
        }else if(cadena == ""){
            respuesta = false; // Cadena vacia
        }else if(cadena.length() > longitud){
            respuesta = false; // Cadena demasiado corta
        }

        return respuesta;
    }

    // Numbers > funciona
    public static boolean validarNumeros(String number, int longitud){
        boolean respuesta = true;
        if(number.length() > longitud || number.length() < longitud){
            respuesta = false;
        }else if(number == ""){
            respuesta = false;
        } else if(number.matches("[0-9]*")) {
            respuesta = true;
        }

        return respuesta;
    }

    // Name > funciona
    public static String validarName(String name){
        int longitud = 15;
        String respuesta = "Nombre invalido";
        if(name.length() > longitud){
            respuesta = "El nombre debe tener una maximo de 15 caracters (solo letras)";
        } else if(name.matches("^[a-zA-z\\s]*$")){
            respuesta = "Nombre valido";
        } else if(name == ""){
            respuesta = "No digito un nombre";
        }

        return respuesta;
    }

    // Surname > funciona

    public static String validarSurname(String surname){
        int longitud = 15;
        String respuesta = "Apellido invalido (debe tener maximo de caracteres solo letras)";
        if(surname.length() > longitud){
            respuesta = "El apellido debe tener una maximo de 15 caracters";
        } else if(surname.matches("^[a-zA-z\\s]*$")){
            respuesta = "apellido valido";
        } else if(surname == ""){
            respuesta = "No digito un apellido";
        }

        return respuesta;
    }
    // Document > funciona
    public static String validarDocument(String documento){
        String respuesta = "Documento invalido (debe ser un numero de 10 digitos)";
        if(documento.matches("\\d{10}")){
            respuesta = "Documento valido";
        }
        return respuesta;
    }
    // Number > funciona
    public static String validarTelefono(String telefono){
        String respuesta = "telefono invalido (debe ser un numero de 10 digitos)";
        if(telefono.matches("\\d{10}")){
            respuesta = "telefono valido";
        }
        return respuesta;
    }
    // Ides > funciona
    public static String validarIdes(String id, String longitud){
        String respuesta = "ID Invalido - debe ser un numero"+longitud+" digitos";
        int l1 = Integer.parseInt(longitud);
        if(id.length() > l1 || id.length() < l1){
            respuesta = "ID Invalido";
        }else if(id == ""){
            respuesta = "No digito un ID";
        } else if(id.matches("[0-9]*")) {
            respuesta = "ID valido";
        }

        return respuesta;
    }
    // password > funciona
    public static boolean validarPassword(String pass){
        if(pass.matches("^(?=\\w*\\d)(?=\\w*[A-Z])(?=\\w*[a-z])\\S{8,16}$")){
            return  true;
        }else{
            return false;
        }
    }


    public static  int validarSate(int estado){
        if(estado == 1){
            return 1;
        }else if(estado == 2){
            return 2;
        }else if(estado == 3){
            return 3;
        }

        return -1;
    }

    //1
    public static boolean existeEmpleado(ArrayList<Empleado> lista, String elemento){
        boolean existe = false;
        for(int i = 0; i<lista.size(); i++){
            if(Objects.equals(lista.get(i).getIdEmpleado() , elemento)){
                existe = true;
            }else{
                existe = false;
            }
        }
        return existe;
    }

    //4
    public static boolean existeEmpleadoName(ArrayList<Empleado> lista, String elemento){
        boolean existe = false;
        for(int i = 0; i<lista.size(); i++){
            if(Objects.equals(lista.get(i).getName() , elemento)){
                existe = true;
            }else{
                existe = false;
            }
        }
        return existe;
    }
}
