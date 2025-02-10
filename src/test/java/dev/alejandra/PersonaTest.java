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

    @Test
    public void testDelgadezSevera() {
        double peso = 40; 
        double altura = 1.70; 
        Persona persona = new Persona(peso, altura);

        String categoria = persona.determineIMCCategory();

        assertEquals("Delgadez severa", categoria);
    }

    @Test
    public void testDelgadezModerada() {
        double peso = 48; 
        double altura = 1.70; 
        Persona persona = new Persona(peso, altura);
    
        String categoria = persona.determineIMCCategory();
    
        assertEquals("Delgadez moderada", categoria);
    }

    @Test
    public void testDelgadezLeve() {
        double peso = 50;
        double altura = 1.70; 
        Persona persona = new Persona(peso, altura);

        String categoria = persona.determineIMCCategory();

        assertEquals("Delgadez leve", categoria);
    }

    @Test
    public void testPesoNormal() {
        double peso = 65; 
        double altura = 1.70; 
        Persona persona = new Persona(peso, altura);

        String categoria = persona.determineIMCCategory();

        assertEquals("Peso normal", categoria);
    }

    @Test
    public void testSobrepeso() {
        double peso = 85; 
        double altura = 1.70; 
        Persona persona = new Persona(peso, altura);

        String categoria = persona.determineIMCCategory();

        assertEquals("Sobrepeso", categoria);
    }

    @Test
    public void testObesidadLeve() {
        double peso = 95; 
        double altura = 1.70; 
        Persona persona = new Persona(peso, altura);

        String categoria = persona.determineIMCCategory();

        assertEquals("Obesidad leve", categoria);
    }

    @Test
    public void testObesidadModerada() {
       
        double peso = 110; 
        double altura = 1.70; 
        Persona persona = new Persona(peso, altura);

        String categoria = persona.determineIMCCategory();

        assertEquals("Obesidad moderada", categoria);
    }

    @Test
    public void testObesidadMorbida() {
        double peso = 130; 
        double altura = 1.70; 
        Persona persona = new Persona(peso, altura);

        String categoria = persona.determineIMCCategory();

        assertEquals("Obesidad mórbida", categoria);
    }

}
