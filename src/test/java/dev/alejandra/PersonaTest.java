package dev.alejandra;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
public class PersonaTest {

    @Test
    void testReturnKg() {

        double kg = 72.6; 
        double meters = 1.67;

        Persona persona = new Persona(kg, meters)

        assertThat(persona.getKg(), is(kg))
     
    }

}
