  /*A proposta é ler vários números até entrar o número -999. Para cada número, e imprimir sua raiz quadrada e seu inverso*/
import javax.swing.JOptionPane;
public class Solucao06 {
    public static void main(String[] args) {

        int contador = 0;

        while (true){

           double numero = Double.parseDouble(JOptionPane.showInputDialog("Inclua um numero, e para parar é só digitar -999"));

           if (numero == -999){
               break;
           }

           JOptionPane.showMessageDialog(null, "A raiz quadrada de "+numero+" é: "+(Math.sqrt(numero))+"\n"
           +"o inverso desse número vai ser "+(Math.pow(numero,-1))+" ou 1/"+numero);

           contador++;
        }



    }

}