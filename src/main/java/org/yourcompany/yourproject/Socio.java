package org.yourcompany.yourproject;

public class Socio extends Usuario {
    private int limiteEmjemplares;
    private int ejemplaresEnPrestamo;
    private double multasPendientes;

    public Socio(String id, String nombre, String email, int limiteEmjemplares) {
        super(id, nombre, email);
        this.limiteEmjemplares = limiteEmjemplares;
        ejemplaresEnPrestamo = 0;
        multasPendientes = 0;
    }

    public void registrarPrestamo (int cantidad){
        if (cantidad > (limiteEmjemplares - ejemplaresEnPrestamo)){
            throw new IllegalArgumentException("Supera el límite del socio");
        }
        if (multasPendientes > 0){
            throw new IllegalArgumentException("No se puede pedir, tiene multa");
        }
        System.out.println("Se prestaron" + cantidad + "libros");
    }
}
