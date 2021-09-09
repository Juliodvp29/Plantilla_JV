package main;

import aux.Func;
import aux.Validations;
import aux.listas;
import class_.Empleado;
import class_.Reporte;
import ux.Login;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello word");

        /*
        System.out.println(LocalDate.now().toString() == ("2021-09-04"));
        System.out.println(LocalDate.now());
        String fecha = LocalDate.now().toString();
        String fecha2 = "2021-09-04";
        System.out.println((Objects.equals(fecha, fecha2)));
        //Login.login();
         */
       // ArrayList<Integer> numeros = new ArrayList<>();
        //numeros.add(1); rden - Dispositivo - idCliente - fecha - precio
        /*
        ArrayList<Reporte> reportes = new ArrayList<>();
        Reporte reporteA =  new Reporte("0002", "Realme50Pro", "12345", "2021-09-05", 4.500);
        Reporte reporteB =  new Reporte("0002", "Realme50Pro", "12345", "2021-09-05", 9.500);
        Reporte reporteC =  new Reporte("0002", "Realme50Pro", "12345", "2021-09-05", 2.500);
        reportes.add(reporteA);
        reportes.add(reporteB);
        reportes.add(reporteC);
        reportes.forEach((n) -> System.out.println(n.toString()));
        System.out.println("\n \n");

        try{
            Func.sortArray(reportes);
        }catch (Exception e){
            System.out.println("error = " + e);
        }
        */


         Login.login();

    }
}

