package calculaCopias;

import java.util.Date;

public class Professor extends Pessoa {
    
    private double salario;
    private String disciplina;
    
    public Professor(String nome, String cpf, Date data_nascimento, double salario, String disciplina) {
		super(nome, cpf, data_nascimento);
                this.salario = salario;
                this.disciplina = disciplina;
    }
	
    @Override
    public double calculaCopias(int qtd) { 
		double preco = 0.10 * (double) qtd;
                double desconto = preco*0.15;
                return preco - desconto;
    }
}
