import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Llamadas{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double[][] zonas = {{12, 2.0}, {15, 2.2}, {18, 4.5}, {19, 3.5}, {23, 6}, {25, 6}, {29, 5}};

        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine(), ",");

            int clave = Integer.parseInt(st.nextToken());
            int numMin = Integer.parseInt(st.nextToken());

            double costos = costo(clave, numMin, zonas);

            System.out.println("el costo por la llamada es: $" + costos);

        }
    }

    public static double costo(int clave, int numMin, double[][] zonas) {

        for (int i = 0; i < zonas.length; i++) {  //zona[0] clave , zona[1] precio por minuti
            if (zonas[i][0] == clave) {
                return zonas[i][1] * numMin;
            }
        }
        return -1;
    }
}

5
23,5
15,4
15,10
29,8