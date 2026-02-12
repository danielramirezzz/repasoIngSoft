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
        Biblioteca biblioteca = new Biblioteca();


        Bibliotecario bibliotecario = new Bibliotecario("19", "Daniel", "daniel.ramirez2", "10");
        biblioteca.agregarBibliotecario(bibliotecario);

        Socio socio = new Socio("1", "Daniel", "Daniel.ramirez", 5);
        biblioteca.agregarSocio(socio);

        System.out.println(biblioteca.darSocios().get(0).darNombre());

    }
}
