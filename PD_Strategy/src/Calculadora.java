public class Calculadora {

    // CONTEXTO
    private Impuesto objImpuesto; // Estrategia
    private double montoBase;

    // CONSTRUCTOR
    public Calculadora(Impuesto objImpuesto, double montoBase) {
        this.objImpuesto = objImpuesto;
        this.montoBase = montoBase;
    }

    // SETTER
    public void setImpuesto(Impuesto impuesto) {
        this.objImpuesto = impuesto;
    }

    // METODO
    public double calcularImpuestos() {
        double impuesto = objImpuesto.calcularImpuesto(this.montoBase);
        double total = montoBase + impuesto;
        System.out.println("Monto: " + montoBase);
        System.out.println("Impuestos: " + impuesto);
        return total;
    }

}
