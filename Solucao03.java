 /* A proposta é iniciar com vários números positivos e imprimir a média dos números digitados*/
import javax.swing.*;

public class Solucao03 {
    public static void main(String[] args) {

        double media = 0;
        int contador = 0;

        while (true){

           String numero = JOptionPane.showInputDialog("Inclua um valor, e para parar é só digitar PARE");

           if (numero.equalsIgnoreCase("PARE")){
               break;
           }
           media = media + Double.parseDouble(numero);
           contador++;
        }

        JOptionPane.showMessageDialog(null, (media/contador));

    }

}