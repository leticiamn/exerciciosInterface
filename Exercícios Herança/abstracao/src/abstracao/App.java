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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeometriaPlana gp = new GeometriaPlana();
        gp.exibe();
        
        gp.mudaParaTriangulo();
        gp.exibe();
        
        gp.mudaParaQuadrado();
        gp.exibe();
        
        gp.mudaParaCirculo();
        gp.exibe();
    }
    
}
