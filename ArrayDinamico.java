/**
 * @author Quispe René Daniel
 * @fecha 27/12/2020
 * Tema: ArrayList
 */
package arraydinamico;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayDinamico {
    private String direcc;
    private String nombre;
    public ArrayDinamico(String d, String n){
        this.direcc=d;
        this.nombre=n;
    }
    public String toString(){
        return "Dirección: " + this.direcc + " Nombre: "+this.nombre;
    }
    public static void main(String[] args) {
        ArrayList <ArrayDinamico> lista= new ArrayList<>();
        lista.add(new ArrayDinamico("Peru 435","Daniel"));
        lista.add(new ArrayDinamico("Guatemala 343","Maia"));
        Iterator j=lista.iterator();
        while(j.hasNext()){
            System.out.println(j.next());
        }
    }
}