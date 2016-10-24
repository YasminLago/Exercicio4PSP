package exercicio4psp;

/**
 *
 * @author Yasmin
 */
public class Impares extends Thread{

    int sumaImpares;
    
    public Impares(String name) {
        super(name);
    }
    
    /**
     * Suma los numeros impares entre 0 y 1000
     */
    public void run(){
        for(int i=0;i<=1000;i++){
            if(i%2!=0)
            sumaImpares = sumaImpares+ i;
        }
        System.out.println(getName()+sumaImpares);  
    }
    
    
}