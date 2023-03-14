
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author vical
 */
public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> Numeros;
        Numeros = new ArrayList<>();
        //adicionar vaores a la lista
        Numeros.add(1);
        Numeros.add(15);
        Numeros.add(22);
        
        //mostrar valores de la lista
        
        System.out.println("muestra lista de elemento originales");
        System.out.println(Numeros.get(0));
        System.out.println(Numeros.get(1));
        System.out.println(Numeros.get(2));
        
        //remover un valor de la lista
        
        Numeros.remove(1);
        
        //muestra numeros de la nueva lista
        System.out.println("muestra lista despues de eliminar un elemento");
        System.out.println("___________________________");
        
        System.out.println(Numeros.get(0));
        System.out.println(Numeros.get(1));

        
        List<String> Nombres;
        Nombres = new ArrayList<String>();
        
        Nombres.add("Peru");
        Nombres.add("Colombia");
        Nombres.add("Mexico");
        Nombres.add("Chile");
        

        //verificamos si existe colombia en la lista
        System.out.println(Nombres.contains("Peru"));
        
        //imprimimos tamaño de la lista Nombres
        System.out.println(Nombres.size());
        
        
        
        
        
    }
    
}
