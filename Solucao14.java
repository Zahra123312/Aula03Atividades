import javax.swing.*;

public class Solucao14 {
    public static void main(String[] args) {

        int contadorNumPrimo = 0; 

        while (true) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número (número negativo para sair):"));

            if (numero < 0) {
                break;  
            }

            if (isPrimo(numero)) {
                contadorNumPrimo++;  
            }
        }

        JOptionPane.showMessageDialog(null, "O total de números primos foi de: " + contadorNumPrimo);
    }
    public static boolean isPrimo(int numero) {
        if (numero < 2) return false;  

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;  
            }
        }
        return true;  
    }
}
