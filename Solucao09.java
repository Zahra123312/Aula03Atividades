/*a proposta é exibir na tela todos os números de 1 a 100 e a sua soma */
import javax.swing.*;
public class Solucao09 {
public static void main(String[] args) {

        double total = 0;
        for (int i = 1; i <= 100; i++) {

            total = total + i;

            JOptionPane.showMessageDialog(null,"os numeros são "+ i);
            JOptionPane.showMessageDialog(null,"o valor da soma vai ser: "+total);
        }

    }

    }
