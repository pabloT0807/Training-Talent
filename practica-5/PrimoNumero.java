public class PrimoNumero{
    
    public static void main(String [] args){
        int numero = 4;

        if(isPrimo(numero)){
            System.out.println("es primo");
        }else{
            System.out.println("no  es primo");
        }
    }

    public static boolean isPrimo(int numero) {

        if (numero <= 1) { //un numero primo no es menor a 1 
            return false;
        }

        for (int i = 2; i < numero; i++) { //desde 2 , 1 no es divisible 
            if (numero % i == 0) { //si es divisible entre i nos es primo (tiene mas divbisores que 1 y numero) 
                return false;
            }
        }
        return true;
    }
}