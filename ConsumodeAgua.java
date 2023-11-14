package consumodeagua;

/**
 *
 * @author hugos
 */
public class ConsumodeAgua {

    public static void main(String[] args) {
        int[][] ConsumoAgua = {
            {100,50,30,120,60},
            {32,122,46,80,90},
            {45,100,56,26,36},
            {60,110,72,33,40}
        };
        int[][] Dia = new int [4][];
        Dia[0] = new int[1];
        Dia[1] = new int[2];
        Dia[2] = new int[3];
        Dia[3] = new int[4];
        
        ConsumoPorCasa(ConsumoAgua);
        System.out.println();
        ConsumoPorDia(ConsumoAgua);
        System.out.println();
    }
        public static void ConsumoPorCasa(int[][] ConsumoAgua) {
                    
        System.out.println("===== Consumo Por Casa =====");        
        for (int i = 0; i < ConsumoAgua.length; i++) {
            int suma = 0;
            for (int j = 0; j < ConsumoAgua[i].length; j++) {
                suma += ConsumoAgua[i][j];
            }
        System.out.println("Consumo Por Casa " + (i + 1) + ": " + suma);
        }
 
        }
        public static void ConsumoPorDia(int[][] ConsumoAgua) {
        System.out.println("======== Consumo Por Dia ========");
        for (int j = 0; j < ConsumoAgua[0].length; j++) {
            int suma = 0;
            for (int i = 0; i < ConsumoAgua.length; i++) {
                suma += ConsumoAgua[i][j];
            }
            System.out.println("Promedio materia " + (j + 1) + ": " + suma);           
        }
        System.out.println();
    }
}   
