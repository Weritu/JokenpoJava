
package exerciciopedrapapeltesoura;

import javax.swing.JFrame;


public class Jogo extends JFrame {
    
  
    
    public  void  getSelection(int pedra, int papel, int tesoura) {
       
        if(pedra == 1){
            System.out.println("Selecionou Pedra");
            
        }
        if(papel == 1){
            System.out.println("Selecionou Papel");
            
        }
        if(tesoura == 1){
            System.out.println("Selecionou Tesoura");
               
        }
    }
}


