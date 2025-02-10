package dev.alejandra;

public class Persona {
    private double kg;
    private double meters;

    public Persona(double kg, double meters) {
        this.kg = kg;
        this.meters = meters;
    }
    public double getKg(){
        return this.kg;
    }

    public double getMeters(){
        return this.meters;
    }

    public double calculateIMC() {
        return Math.round(this.kg / (Math.pow(this.meters, 2)) * 100) / 100.0;
    }

    public String determineIMCCategory() {
        double imc = calculateIMC();

        if (imc < 18.5) {
            return imc < 16 ? "Delgadez severa" : (imc < 17 ? "Delgadez moderada" : "Delgadez leve");
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else if (imc < 35) {
            return "Obesidad leve";
        } else if (imc < 40) {
            return "Obesidad moderada";
        } else {
            return "Obesidad mórbida";
        }
    }

}
