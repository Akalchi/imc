package dev.alejandra;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        assertThat(persona.getMeters(),is(meters));
    }

     @Test
    public void testCalculateIMC_normalCase() {
        Persona persona = new Persona(75, 1.75); 

        double imc = persona.calculateIMC();

        assertEquals(24.49, imc, 0.01); 
    }

    @Test
    public void testCalculateIMC_lowHeight() {
        Persona persona = new Persona(60, 1.5); 

        double imc = persona.calculateIMC();

        assertEquals(26.67, imc, 0.01);
    }

    @Test
    public void testCalculateIMC_highWeight() {
        Persona persona = new Persona(100, 1.8);

        double imc = persona.calculateIMC();

        assertEquals(30.86, imc, 0.01);
    }

}
