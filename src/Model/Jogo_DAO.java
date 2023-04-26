
package Model;

import java.util.Random;
import javax.swing.JOptionPane;


public class Jogo_DAO {
    public static void jogo(){
        Random gerador = new Random();
        
        int [] jogador = new int [10];
        int [] maquina = new int [10];
        int acertos = 0, erros = 0;
        
        //Definicção dos Números
        for (int i = 0; i < 10; i++) {
            maquina[i] = gerador.nextInt(3);
        }
        
        //Jogador
        for (int i = 0; i < 10; i++) {
            String x = JOptionPane.showInputDialog(null, "Numero: "+(i+1)+"\nDigite um numero entre 0 e 2");
            jogador[i] = Integer.parseInt(x);
        }
        
        //Comparação 
        for (int i = 0; i < 10; i++) {
            if(maquina[i] == jogador[i]){
                acertos++;
            }else{
                 erros++;
            }
        }
        JOptionPane.showMessageDialog(null, "Acertos: "+ acertos + "\nErros: "+ erros);
    }
}