import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto a pagar: ");
        double montoPagar = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Eres VIP? (Si/No): ");
        String respuesta = scanner.nextLine();


        if (respuesta.equalsIgnoreCase("Si")) {
            // Descuento VIP, se ignora el DescuentoPorVolumen
            ProcesarOrden clienteVIP = new ProcesarOrden(new DescuentoVIP());
            clienteVIP.procesar(montoPagar);
        } else if (respuesta.equalsIgnoreCase("No")) {
            // Descuento por monto mayor a $500.00
            ProcesarOrden clientePorVolumen = new ProcesarOrden(new DescuentoPorVolumen());
            clientePorVolumen.procesar(montoPagar);
        } else {
            // Sin descuento
            ProcesarOrden clienteSinDescuento = new ProcesarOrden(new SinDescuento());
            clienteSinDescuento.procesar(montoPagar);
        }

    }
}
