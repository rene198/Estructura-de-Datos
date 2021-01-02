/*
 * @author Quispe René Daniel
 * @fecha 29/12/2020
 * Tema: Tipo de datos Genéricos
 */
package genericos;
//T es un parámetro de tipo  que será reemplazado por un tipo real cuando se crea un objeto de tipo genericos
public class Genericos<T extends Number> {
    private T minX, maxX, minY, maxY; //Declara 4 objetos de tipo T
    //Pasa al constructor 4 referencias a 4 objetos de tipo T
    public Genericos(T miX, T miY, T maX, T maY){
        this.minX=miX;
        this.maxX=maX;
        this.minY=miY;
        this.maxY=maY;
    }
    @Override
    public String toString(){
        return this.getClass().getSimpleName() + ": " + minX + ", " + minY + ", " + maxX + ", " + maxY;
    }
    //Muestra el tipo de T
    void mostrarTipo(){
        System.out.println("El tipo de T es: " + minX.getClass().getName());
    }
    //Get y Set
    public T getMinX(){return minX;}
    public void setMinX(T miX){this.minX=miX;}
    
    public T getMinY(){return minY;}
    public void setMinY(T miY){this.minY=miY;}
    
    public T getMaxX(){return maxX;}
    public void setMaxX(T maX){this.maxX=maX;}
    
    public T getMaxY(){return maxY;}
    public void setMaxY(T maY){this.maxY=maY;}
}
