/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracao;

/**
 *
 * @author aluno
 */
public class GeometriaPlana {
    private Figura2D fig = new Circulo();
    
    public void mudaParaCirculo(){
        this.fig = new Circulo();
    }
    
    public void mudaParaTriangulo(){
        this.fig = new Triangulo();
    }
    
    public void mudaParaQuadrado(){
        this.fig = new Quadrado();
    }
    
    public void exibe(){
        System.out.println(fig.pegaTexto());
    }

}
