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
public class Main {

    public static void teste() throws DivisaoNaoExata {
        int [] num = {4,8,5,16,32,21,64,128,62,80, 90};
        int [] den = {2,0,4,8,0,2,4};
        for(int i=0; i<num.length; i++)
            try{
                if(num[i] % den[i] != 0)
                   throw new DivisaoNaoExata(num[i],den[i]);
                System.out.println(num[i] + "/" + den[i] + "=" + (num[i]/den[i]));
            }
            catch(DivisaoNaoExata ex){
                System.out.println(ex.getMessage());
            }
    }
    public static void main(String[] args) throws DivisaoNaoExata {
        try {
            teste();
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException ex) {
            System.out.println("Deu exceção: Não é possível dividir!"); 
        }
    }
    
}
