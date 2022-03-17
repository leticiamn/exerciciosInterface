package prog3tratamento;

import java.util.Scanner;

/**
 *
 * @author Clarimundo
 */
public class Prog3Tratamento {

    public static final String SENHASECRETA = "123456";
    
    public static void verificaSenha(String s) throws Exception
    {
        if(!s.equals(SENHASECRETA)) {
            throw new Exception("Senha invalida!!!");
        }
    }
    
    public static void main(String[] args) {
        try {
          Scanner s = new Scanner(System.in);
          System.out.print("Digite a senha: ");
          String senha = s.nextLine();
          verificaSenha(senha);           
          System.out.println("Senha correta!!!\nBem vindo(a)!!!");
        }catch(Exception ex) {
          System.err.println(ex.getMessage());
        }   
    }
}
