package exercicio4psp;

/**
 *
 * @author Yasmin
 */
public class Pares extends Thread{

    int sumaPares;
    
    public Pares(String name) {
        super(name);
    }
    
    /**
     * Suma los numeros pares entre 0 y 1000
     */
    public void run(){
        for(int i=0;i<=1000;i++){
            if(i%2==0)
            sumaPares = sumaPares+1; 
        }
        System.out.println(getName()+sumaPares);
        
    }
    
    
}
