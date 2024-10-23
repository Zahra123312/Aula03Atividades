 /* A proposta é ler vários números e informar quantos números entre 100 e 200 foram digitados, e quando o valor 0  for lido o algoritmo deverá cessar sua a execução*/
import javax.swing.*;

public class Solucao04 {
    public static void main(String[] args) {
    int contagem = 0;
    int numeroEntre100e200 = 0;

        while (true){
           double numero = Double.parseDouble(JOptionPane.showInputDialog("Inclua um valor, e para parar é só digitar 0"));

           if (numero == 0){
               break;
           }
           if (numero > 100 && numero < 200){
               numeroEntre100e200++;
           }

           contagem++;
        }

        JOptionPane.showMessageDialog(null, "O total de número entre 100 e 200 foi "+numeroEntre100e200);

    }

}