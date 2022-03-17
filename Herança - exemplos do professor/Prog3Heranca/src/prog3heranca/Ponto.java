package prog3heranca;

public class Ponto {
    
    protected double x, y;
    
    public Ponto(){        
    }
    
    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }   
    
    public String exibe(){
        return x+"  ,  "+y;
    }
}
