/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class JavaApplication1 {
    
    public static final String testeSenha = "12345";

    public static boolean verificaSenha(String senha) throws Exception {
        if(!senha.equals(testeSenha)) { 
            throw new Exception("Senha inválida!");
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean auth = false;
        
        do{
        System.out.println("Digite a senha: ");
        String senha = sc.nextLine();
        
        try {
            verificaSenha(senha);
            System.out.println("Acesso liberado!");
            
            auth = true;
        } catch (Exception ex){
            System.err.println(ex.getMessage());
        }
        } while (!auth);        
    }
    
}
