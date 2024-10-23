/*a proposta é iniciar com um número e verificar se ele é um número primo*/
import javax.swing.*;

public class Solucao13 {
    public static void main(String[] args) {

        int contador = 0;

        while (true) {

            String numero =  JOptionPane.showInputDialog("Digite um numero, digite PARE para encerrar");

            if (numero.equalsIgnoreCase("Pare")) {
                break;
            }

            int num = Integer.parseInt(numero);
            int contadorNumPrimo = 0;
            for (int i = 2; i < num; i++) {
               if (num % i == 0) {
                   JOptionPane.showMessageDialog(null, "O numero "+numero+" Não é primo");
                   contadorNumPrimo++;
                   break;
               }

            }

            if (contadorNumPrimo == 0) {
                JOptionPane.showMessageDialog(null, "O numero "+numero+" é primo");

            }

            contador++;
        }

    }

    }