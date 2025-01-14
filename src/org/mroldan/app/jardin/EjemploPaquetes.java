package org.mroldan.app.jardin;
import org.mroldan.app.hogar.*;

import static org.mroldan.app.hogar.Persona.*;
import static org.mroldan.app.hogar.ColorPelo.*;

public class EjemploPaquetes {

    public static void main(String[] args) {

        Persona p = new Persona();
        p.setNombre("Marce");
        p.setApellido("Roldán");
        p.setColorPelo(CAFE);
        System.out.println(p.getNombre());

        Perro perro = new Perro();
        perro.nombre= "tobby";
        perro.raza = "Bulldog";
        
        String jugando = perro.jugar(p);
        System.out.println("jugando = " + jugando);
        String saludo = saludar();
        System.out.println("saludo = " + saludo);
        String generoMujer = GENERO_FEMENINO;
        String generoMasculino = GENERO_MASCULINO;

    }
}
