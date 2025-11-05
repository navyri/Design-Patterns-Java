public class Main {
    public static void main(String[] args) {

        double monto = 100;

        Calculadora calculadoraGeneral = new Calculadora(new ImpuestoGeneral(), monto);
        calculadoraGeneral.calcularImpuestos();

        Calculadora calculadoraReteFuente = new Calculadora(new ImpuestoReteFuente(), monto);
        calculadoraReteFuente.calcularImpuestos();

        Calculadora calculadoraImpuestoSeguridad = new Calculadora(new ImpuestoSeguridad(), monto);
        calculadoraImpuestoSeguridad.calcularImpuestos();
        System.out.println(" ");

        // Usar mismo objeto para diferentes comportamientos en tiempo de ejecucion
        Calculadora calculadoraDinamica = new Calculadora(new ImpuestoGeneral(), monto * 2);
        calculadoraDinamica.calcularImpuestos();

        calculadoraDinamica.setImpuesto(new ImpuestoReteFuente());
        calculadoraDinamica.calcularImpuestos();

        calculadoraDinamica.setImpuesto(new ImpuestoSeguridad());
        calculadoraDinamica.calcularImpuestos();

    }
}
