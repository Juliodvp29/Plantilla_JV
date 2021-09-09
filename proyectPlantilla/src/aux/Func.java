package aux;

import class_.Reporte;

import java.util.ArrayList;

public class Func {
    public  static void sortArray (ArrayList<Reporte> reportes){
        double arr[] = new double[reportes.size()];
        double aux;

        for (int i = 0; i<reportes.size(); i++){
            arr[i] = reportes.get(i).getPrecio();
        }

        for(int i = 0; i<(arr.length-1); i++){
            for(int j=0; j<(arr.length-1); j++){
                if(arr[j] > arr[j+1]){
                    aux = reportes.get(i).getPrecio();
                    reportes.get(i).setPrecio(reportes.get(i+1).getPrecio());
                    reportes.get(i+1).setPrecio(aux);

                }
            }
            reportes.forEach((n) -> System.out.println(n.toString()));
            break;
        }
      }

    }

