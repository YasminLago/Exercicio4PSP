package exercicio4psp;

/**
 *
 * @author Yasmin
 */
public class DosYTres extends Thread{

    int sumaDosTres;
    
    public DosYTres(String name) {
        super(name);
    }
    
    /**
     * Suma los numeros acabados en 2 o 3 entre 0 y 1000
     */
    public void run(){
        for(int i=0;i<=1000;i++){
            if(i%10==2 || i%10==3)
            sumaDosTres = sumaDosTres+ i;
        }
        System.out.println(getName()+sumaDosTres);  
    }
    
    
}