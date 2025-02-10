package dev.alejandra;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
public class PersonaTest {
    
    private Persona persona;
    private double kg = 72.6;
    private double meters = 1.75;

    @BeforeEach
    void beforeEach() {

        persona = new Persona(kg, meters);
    }

    

    @Test
    void testReturnKg() {

        assertThat(persona.getKg(), is(kg));
    }
    @Test
    void testReturnMetres() {

    }

}
