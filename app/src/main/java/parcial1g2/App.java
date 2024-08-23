package parcial1g2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        try {
            int valorFinal = 0;
            int cantidadVehiculos = 0;
            int avaluo = 0;
            String decada = "";
            Scanner usu = new Scanner(System.in);

            System.out.println("¿Cuantos vehiculos desea calcular?");
            cantidadVehiculos = usu.nextInt();
            usu.nextLine();

            if (cantidadVehiculos >= 1) {

                for (int i = 1; i <= cantidadVehiculos; i++) {
                    System.out.println("[VEHICULO " + i + "]");
                    System.out.print(" INGRESAR LA DECADA DEL VEHICULO:");
                    decada = usu.nextLine();
                    if (decada.equals("90") || decada.equals("00") || decada.equals("10") || decada.equals("20")) {
                        System.out.print(" INGRESAR EL AVALUO DEL VEHICULO:");
                        avaluo = usu.nextInt();
                        usu.nextLine();
                        valorFinal = calcularTotalImpuestos(decada, avaluo);

                        System.out.println("--------------------------------------------");
                        System.out.println("| VEHICULO " + i + " MODELO DECADA: " + decada);
                        System.out.println("| AVALUO DE: " + avaluo + " COP");
                        System.out.println("| VALOR TOTAL A PAGAR: " + valorFinal + " COP");
                        System.out.println("---------------------------------------------");
                    } else {
                        System.out.println("[DECADA NO VÁLIDA]");
                        System.out.println("---------------------------------------------");
                    }

                }

            } else {
                System.out.println("DATO INVÁLIDO");
            }
        } catch (Exception e) {
            System.out.println("[VUELVA A INTENTAR]");
        }
    }

    /*
     * Implemente una funcion llamada calcularTotalImpuestos que cumpla con las
     * siguientes caracteristicas
     * Recibe:
     * - Una cadena de caracteres que representa la decada (70, 80, 90, 00, 10, 20,
     * Otra)
     * - Un entero que representa avaluo del vehiculo
     * Retorna:
     * - Un entero representando el valor total a pagar de los impuestos
     * Controlar errores retornando -1
     */
    // ------------------------------------------------------------------

    public static int calcularTotalImpuestos(String decada, int avaluo) {
        try {
            int valorFinal = 0;
            int valorSeguro = 0;
            int valorImpuestoR = 0;
            switch (decada) {
                case "90":
                    valorImpuestoR = (int) (avaluo * 0.0409);
                    valorSeguro = (int) (avaluo * 0.00816);
                    valorFinal = valorImpuestoR + valorSeguro;
                    break;

                case "00":
                    valorImpuestoR = (int) (avaluo * 0.0434);
                    valorSeguro = (int) (avaluo * 0.00798);
                    valorFinal = valorImpuestoR + valorSeguro;
                    break;

                case "10":
                    valorImpuestoR = (int) (avaluo * 0.0493);
                    valorSeguro = (int) (avaluo * 0.00712);
                    valorFinal = valorImpuestoR + valorSeguro;
                    break;

                case "20":
                    valorImpuestoR = (int) (avaluo * 0.05680);
                    valorSeguro = (int) (avaluo * 0.00699);
                    valorFinal = valorImpuestoR + valorSeguro;
                    break;

                default:
                    valorFinal = -1;
                    break;
            }
            return valorFinal;

        } catch (Exception e) {
            return -1;
        }
    }

    // ------------------------------------------------------------------

}
