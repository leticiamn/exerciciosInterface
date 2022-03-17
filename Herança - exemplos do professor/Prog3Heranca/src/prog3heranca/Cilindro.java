package prog3heranca;

import java.text.DecimalFormat;

public class Cilindro extends Circulo {
    
    private double altura;
    
    public Cilindro (){         
    }
    
    public Cilindro(double raio, double altura){
        super(raio);
        this.altura = altura;
    }
    
    @Override
    public double area(){
        return 2*Math.PI*raio*altura;
    }
       
    public double volume(){
        return super.area()*altura;
    }
    
    @Override
    public String exibe(){
        DecimalFormat df = new DecimalFormat("#,###.00");
        return "Cilindro\n\nÁrea da base = "+df.format(super.area())+
               "\nÁrea Lateral = "+df.format(area())+
               "\nÁrea Total = "+((df.format(2*super.area()))+df.format(area()))+ 
               "\nVolume = "+df.format(volume());
    }
}

