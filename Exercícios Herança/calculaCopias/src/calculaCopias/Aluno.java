package calculaCopias;

import java.util.Date;

public class Aluno extends Pessoa{
    private long matricula;
    
    public Aluno(String nome, String cpf, Date data_nascimento, long matricula){
        super(nome,cpf,data_nascimento);
        this.matricula = matricula;
    }

    public long getMatricula() {
        return matricula;
    }   
    
    @Override
    public double calculaCopias(int qtd) { 
		double preco = 0.10 * (double) qtd;
                double desconto = preco*0.2;
                return preco - desconto;
    }
    
}
