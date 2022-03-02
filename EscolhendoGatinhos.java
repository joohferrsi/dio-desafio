package code;

import javax.swing.JOptionPane;

public class EscolhendoGatinhos {

public static void main(String[] args) {

        
        String[] nomesgatinhos = {"Bibi","Kaka","Luke"};

       int numero = JOptionPane.showOptionDialog(null, "Qual o nome do gatinho que quer conhecer?", "Escolha", 0, JOptionPane.QUESTION_MESSAGE, null, nomesgatinhos, "");
        

        switch (numero) {
            case 0: JOptionPane.showMessageDialog(null, "Essa é a Bibi! \n \n Idade: 1 ano \n Peso: 1.2 Kilos \n Cor:Preta");
            break;

            case 1: JOptionPane.showMessageDialog(null,"Esse é o Kaka! \n \n Idade: 5 anos \n Peso: 2.5 Kilos \n Cor:Amarelo");
            break;

            case 2: JOptionPane.showMessageDialog(null,"Esse é o Luke! \n \n Idade: 2 anos \n Peso: 1.9 Kilos \n Cor:Branco");
            break;
        }
            
        }
        

}

