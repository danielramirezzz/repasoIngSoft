/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

/**
 *
 * @author danip
 */
public class Main {

    public static void main(String[] args) {
        Bibliotecario bibliotecario = new Bibliotecario("12", "Juan", "Juan.solano", "23");
        System.out.println(bibliotecario.darEmail());

        Socio socio = new Socio("1", "Daniel", "Daniel.ramirez", 5);
        socio.registrarPrestamo(5);
    }
}
