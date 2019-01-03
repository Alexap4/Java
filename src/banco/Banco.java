
package banco;


public class Banco {

  
    public static void main(String[] args) {
        
        Cuenta cuentapesos = new Cuenta("José",200);
        Cuenta cuentadolares = new Cuenta("Jorge",30);
        
        cuentapesos.ingresar(1000);
        cuentadolares.ingresar(400);
        
        
        cuentadolares.retirar(50);
        cuentapesos.retirar(800);
        
        System.out.println(cuentapesos);
        System.out.println(cuentadolares);
                
    }
    
}
