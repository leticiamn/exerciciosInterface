package calculaCopias;

import java.text.DecimalFormat;
import java.util.Date;

public class calculaCopias {


    public static void main(String[] args) {

        Aluno al = new Aluno("Jose Francisco", "123.456.789-00", new Date(), 123456);
	Professor pr = new Professor("Maria Antônia", "190.333.789-01", new Date(), 8500,"POO");
	Funcionario fn = new Funcionario("Maria Antônia", "190.333.789-01", new Date(), 8500,new Date(),"Professor");
        int qtd = 100;
        DecimalFormat df = new DecimalFormat("#,###.00");
        
        System.out.println("O aluno irá gastar R$"+df.format(al.calculaCopias(qtd))+" com as "+qtd+" cópias");
	System.out.println("O professor irá gastar R$"+df.format(pr.calculaCopias(qtd))+" com as "+qtd+" cópias");
	System.out.println("O funcionário irá gastar R$"+df.format(fn.calculaCopias(qtd))+" com as "+qtd+" cópias");
        int x = 2;
        int y = 3;
        System.out.println((3.1415 * y-3) > (y*x-7));

    }
    
}
