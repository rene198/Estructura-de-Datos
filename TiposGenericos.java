package genericos;
public class TiposGenericos {
    public static void main(String[] args) {
        //Crea un objeto Genericos<integer> y asigna su referencia(0,0,1920,1280)
        Genericos<Integer> planoEntero= new Genericos<>(0,0,1920,1280);
        //Prueba de Genéricos
        Genericos<Double> planoDouble=new Genericos<>(-1.0, -1.0, 1.0, 1.0);
        System.out.println(planoEntero);
        System.out.println(planoDouble);
        //Asignamos un valor nuevamente
        planoEntero.setMinX(560);
        //Obtener el valor, necesitamos una conversión
        int aux=planoEntero.getMinX();
        System.out.println("Valor: "+aux);
        //Muestra el tipo de dato utilizado por planoEntero
        planoEntero.mostrarTipo();
        planoDouble.mostrarTipo();
    }
}
