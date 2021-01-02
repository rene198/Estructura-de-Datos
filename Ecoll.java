package ejercollections;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Collections;
public class Ecoll {
    public static void main(String[] args) {
        ArrayList <Integer> aux= new ArrayList<>();
        Integer temp;
        for(int i=0; i<20; i++){
            temp=(int)(Math.random() *15);
            aux.add(temp);
        }
        System.out.println("Listado: " + aux);
        System.out.println("Listado Ordenado: ");
        Collections.sort(aux);
        System.out.println(aux);
        System.out.println("Listado Decreciente: " );
        Collections.reverse(aux);
        System.out.println(aux);
    }
}
