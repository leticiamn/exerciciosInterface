/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisaoNaoExata;

/**
 *
 * @author letic
 */
public class DivisaoNaoExata extends Exception{
    private int num, den;
    
    public DivisaoNaoExata(int num, int den){
        super();
        this.num = num;
        this.den = den;
    }
    
    
    @Override
    public String getMessage(){
        return "Resultado de "+ num + "/" + den + " não é inteiro";
    }
}
