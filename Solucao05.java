import javax.swing.*;
public class Solucao05 {
    public static void main(String[] args) {

        int contagem = 0;
        int numeroEntre100e200 = 0;
        String nomes = "";

        while (true){

           String nome = JOptionPane.showInputDialog("Inclua um nome, para parar é só digitar FIM");

           if (nome.equalsIgnoreCase("FIM")){
               break;
           }
           nomes = nomes+"\n"+nome;
           contagem++;
        }

        JOptionPane.showMessageDialog(null, "Os nomes digitados foram: "+nomes);

    }

}
