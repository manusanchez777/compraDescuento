import java.util.Scanner;

public class CompraDescuento {
    public static void main(String[] args) {

        Scanner entradaUsuario = new Scanner(System.in);

        System.out.print("Ingresa el valor de la compra: ");
        double valorCompra = entradaUsuario.nextDouble();
        
        if (valorCompra > 200000) {
            double descuento = valorCompra * 0.15;
            double totalConDescuento = valorCompra - descuento;
            System.out.println("Se aplicó un 15% de descuento.");
            System.out.println("Total a pagar: $" + totalConDescuento);
        } else {
            System.out.println("No aplica descuento.");
            System.out.println("Total a pagar: $" + valorCompra);
        }

        entradaUsuario.close();
    }
}
