/* a proposta é ler vários números até entrar o número -999. Para cada número, imprimir seus divisores */
import javax.swing.*;
public class Solucao10 {
    public static void main(String[] args) {

     while (true){
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Inclua um numero"));

        if (numero == -999){
            break;
        }

         for (int i = 0; i < numero; i++) {
             if (numero % i == 0){
                 JOptionPane.showMessageDialog(null, "O numero "+numero+" ele pode ser dividido por: "+i);
                }

            }
        }
    }
 }
