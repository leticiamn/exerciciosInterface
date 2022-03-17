
package prog3heranca;

import javax.swing.JOptionPane;

public class Prog3Heranca {

    
    public static void main(String[] args) {
        
        double xc, yc, raio, altura;
        int op;
        Ponto pt;
        Circulo cir;
        Cilindro cil;
        
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog("    MENU\n\n1-Ponto\n2-Círculo\n3-Cilindro\n4-SAIR"));
            switch(op){
                case 1: xc = Double.parseDouble(JOptionPane.showInputDialog("Digite a coordenada x do ponto:"));
                        yc = Double.parseDouble(JOptionPane.showInputDialog("Digite a coordenada y do ponto:"));
                        pt = new Ponto(xc,yc);
                        JOptionPane.showMessageDialog(null,"Ponto (x,y)\n\n( "+pt.exibe()+" )","SAIDA",1);
                        break;
                case 2: xc = Double.parseDouble(JOptionPane.showInputDialog("Digite a coordenada x do centro:"));
                        yc = Double.parseDouble(JOptionPane.showInputDialog("Digite a coordenada y do centro:"));
                        raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do círculo:"));
                        cir = new Circulo(raio,xc,yc);
                        JOptionPane.showMessageDialog(null,cir.exibe(),"SAIDA",1);
                        break;
                case 3: raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio da base do cilindro:"));
                        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do cilindro:"));
                        cil = new Cilindro(raio,altura);
                        JOptionPane.showMessageDialog(null,cil.exibe(),"SAIDA",1);
            }
        }while(op!=4);        
    }
    
}
