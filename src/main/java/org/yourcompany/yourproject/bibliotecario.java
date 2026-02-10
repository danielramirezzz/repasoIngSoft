
package org.yourcompany.yourproject;

public class bibliotecario extends  usuario{

    private String turno;

    public bibliotecario(String id, String nombre, String email) {
        super(id, nombre, email);
        this.turno = turno;
    }

    public String darTurno(){
        return this.turno;
    }
}
