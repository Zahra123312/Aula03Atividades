import javax.swing.*;
public class Solucao11 {
public static void main(String[] args) {

        double totalConsumo1 = 0;
        double totalConsumo2 = 0;
        double totalConsumo3 = 0;

        int contador = 0;
        int contadorConsumidor1e2 = 0;
        double mediaConsumidor1e2 = 0.0;
        while (true){

        String codigoConsumidor = JOptionPane.showInputDialog("Inclua o codigo do consumidor: ");

        if (codigoConsumidor.equalsIgnoreCase("0")){
            break;
        }

        double qtdKwh = Double.parseDouble(JOptionPane.showInputDialog("Inclua a quantidade de kWh consumidos durante o mês"));
        int tipoConsumidor = Integer.parseInt(JOptionPane.showInputDialog("Inclua tipo de consumidor: "));

        double custoTotal = 0;
        if (tipoConsumidor == 1){
           custoTotal = qtdKwh * 0.3;
           totalConsumo1 = totalConsumo1 + qtdKwh;
        }

        if (tipoConsumidor == 2){
                custoTotal = qtdKwh * 0.5;
                totalConsumo2 = totalConsumo2 + qtdKwh;

        }

        if (tipoConsumidor == 3){
                custoTotal = qtdKwh * 0.7;
                totalConsumo3 = totalConsumo3 + qtdKwh;


        }

        if (tipoConsumidor == 1 || tipoConsumidor == 2){
            mediaConsumidor1e2 = mediaConsumidor1e2 + qtdKwh;
            contadorConsumidor1e2++;
        }

        JOptionPane.showMessageDialog(null, "O custo total do consumidor de codigo: "+codigoConsumidor+" é: "+ custoTotal);


        contador++;
     }
        JOptionPane.showMessageDialog(null,"O total de consumo para o tipo 1 é: "+ totalConsumo1+"\n"+
                "O total de consumo para o tipo 2 é: "+totalConsumo2+"\n O total de consumo para o tipo 3 é: "+totalConsumo3);

        JOptionPane.showMessageDialog(null,"A media do consumidor 1 e 2 vai ser: "+ (mediaConsumidor1e2/contadorConsumidor1e2)+"\n");


    }

    }
