//Arreglos en java 1 y 2 dimensiones
public class Run{
    public static void main(String [] args){
        //arreglo unidemensional
        int []  arreglo1D = new int[5];

        //inicilizar y asignar valores a cada posicion
        arreglo1D[0] = 10;
        arreglo1D[1] = 20;
        arreglo1D[2] = 30;
        arreglo1D[3] = 40;
        arreglo1D[4] = 50;

        System.out.println(arreglo1D[4]);

        //inicilizar los valores del arreglo
        int[] arreglo1DSf = {10,20,30,40,50};

        System.out.println(arreglo1DSf[2]);

        int [][] arreglo2D = new int[3][4]; //colu y fil

        //iniziliazacio y asignacion de valores de primera forma 
        arreglo2D[0][0] = 1;
        arreglo2D[1][0] = 5;
        arreglo2D[2][0] = 5;

        //otra forma de inizializar un arreglo uni
        int [][] otraForma2D = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };

        for(int i = 0 ; i<arreglo2D.length;i++){
            for(int j=0;j<arreglo2D[i].length;j++){
                System.out.println(arreglo2D[i][j] + "\t");
            }
            System.out.println("");
        }



    }
}