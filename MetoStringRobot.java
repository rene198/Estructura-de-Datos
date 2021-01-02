/*
 Autor Quispe René D.
Fecha: 29/12/2020
Tema: Método toString()
 */
package metostring;
import java.util.Random;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class MetoStringRobot {
    private int id;
    private String fecha;
    private String nombre;
    public MetoStringRobot(String nom){
        SetId();
        SetFecha();
        this.nombre=nom;
    }
    private void SetId(){
        Random nal= new Random();
        id=nal.nextInt(8);
    }
    public int getId(){return id;}
    private void SetFecha(){
        LocalDate fcomp= LocalDate.now();
        DateTimeFormatter formfecha= DateTimeFormatter.ofPattern("dd 'de' LLLL 'de' yyyy");
        fecha=fcomp.format(formfecha);
    }
    public String getFecha(){return fecha;}
    public static void main(String[] args) {
        MetoStringRobot robot=new MetoStringRobot("Savio");
        System.out.println(robot);
    }
    @Override
    public String toString(){
       return "Robot n° " + id + "; " + "creado el " + fecha + ", con nombre "+ nombre +"."; 
    }
}
