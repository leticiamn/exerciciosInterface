package saque;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author letic
 */

public class Main {
    public static Double saque(Double valor) throws IllegalArgumentException {
        if(valor > 400) throw new TesteSaque();
        else return valor;
    }
    public static void main(String[] args) throws IllegalArgumentException  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual valor deseja sacar?");
        Double valor = sc.nextDouble();
        try {
            saque(valor);
            System.out.println("Saque realizado de "+valor+" reais.");
        } catch (TesteSaque e) {
            System.out.println(e.getMessage());
        }
    }
    
}
