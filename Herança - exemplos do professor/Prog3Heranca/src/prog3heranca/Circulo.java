package prog3heranca;

import java.text.DecimalFormat;

public class Circulo extends Ponto {

    protected double raio;
    
    public Circulo(){        
    }

    public Circulo(double raio){
        super();
        this.raio = raio;
    } 
    
    public Circulo(double raio, double xc, double yc){
        super(xc,yc);
        this.raio = raio;
    }    

    public double area(){
        return Math.PI*Math.pow(raio,2);
    }
    
    @Override
    public String exibe(){
        DecimalFormat df = new DecimalFormat("#,###.00");
        return "Círculo\n\nCentro = ( "+super.exibe()+" )\nRaio = "+raio+"\nÁrea = "+df.format(area());
    }
}
