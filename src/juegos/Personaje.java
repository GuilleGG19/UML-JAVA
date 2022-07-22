package juegos;

public abstract class Personaje {
    private String nombre;
    private String descripcion;
    private long tamaño;
    private int poder;
    private int vida;

    private void desplazarse(){
        System.out.prinln("Moverse");
    }
    private int mostrarvida;

    private void mostrarpoder(){
        System.out.prinln("bebito fiufiu");
    }
}
