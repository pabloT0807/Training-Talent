import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.*;

public class Run{
    public static void main(String [] args){

        //ArraList implementacion con listas

        List<String> listaFrutas = new ArrayList<>();

        listaFrutas.add("Manzana");
        listaFrutas.add("Pera");
        listaFrutas.add("Uva");
        listaFrutas.add("Fresa");

     //   System.out.println("Lista de frutas : " + listaFrutas.get(1));

    //foreach
    /*    for(String fruta : listaFrutas){
            System.out.println("- " + fruta);
        }
    } */

        //HashSet omite cuando se repite un valor d

        Set<String> listaColores = new HashSet<>();

        listaColores.add("verde");
        listaColores.add("blanco");
        listaColores.add("azul");
        listaColores.add("azul");


        // System.out.println("Lista de frutas : " + listaColores);

         //System.out.println("contiene verde ? " + listaColores.contains("verde"));

     /*    for(String colores : listaColores){
            System.out.println("- " + colores);
        } */

       //Map 

       Map<String , Integer> listaEdades = new HashMap<>();

       listaEdades.put("Luis" , 24);
       listaEdades.put("Pablo" , 23);
       listaEdades.put("Fer" , 21);
       listaEdades.put("Diana" , 24);
       listaEdades.put("Adrian" , 50);

       //System.out.println("lista de equipo de trabajo y edades " + listaEdades);
       
       //System.out.println("se encuentra david ?  " + listaEdades.containsKey("David"));

       //listaEdades.put("Adrian" , 45); //actualizar

        for( Map.Entry<String,Integer> personas : listaEdades.entrySet()){ //VISTA CONETIDA DEL MAPA
            System.out.println("- " + personas.getKey() + ": " + personas.getValue() + "años");
        }

    }


}