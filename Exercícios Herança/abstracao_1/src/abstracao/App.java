package abstracao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class App {
   
    
    public static void main(String[] args) {
        Figura2D fig[] = new Figura2D[3];
        
        fig[0] = new Circulo();
        fig[1] = new Triangulo();
        fig[2] = new Quadrado();
        
        for (Figura2D fig1 : fig) {
            System.out.println(fig1.pegaTexto());
        }
        
    }
    
    
}
