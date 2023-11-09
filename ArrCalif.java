package arrcalif;
public class ArrCalif {

    public static void main(String[] args) {
        
    //Las calificaciones
        double[][] calificaciones = {
            {90.5, 85.0, 78.5, 92.0},
            {88.0, 76.5, 89.0, 94.5},
            {70.0, 82.5, 91.0, 87.5}
        };
        
        int[][] Alumnos = new int [3][];
        Alumnos[0] = new int[1];
        Alumnos[1] = new int[2];
        Alumnos[2] = new int[3];
        
        int[][] Materias = new int [4][];
        Materias[0] = new int[1];
        Materias[1] = new int[2];
        Materias[2] = new int[3];
        Materias[3] = new int[4];

        System.out.println("Total de Alumnos: ");
        System.out.println(Alumnos.length);
        System.out.println("Total de Materias: ");
        System.out.println(Materias.length);
        PromedioEstudiante(calificaciones);
        PromedioMateria(calificaciones);
    }

    //Calcula el promedio de cada estudiante
    public static void PromedioEstudiante(double[][] calificacion) {
        
        System.out.println("===== PROMEDIO POR ESTUDIANTE =====");        
        for (int i = 0; i < calificacion.length; i++) {
            double suma = 0;
            for (int j = 0; j < calificacion[i].length; j++) {
                suma += calificacion[i][j];
            }
            double promedio = suma / calificacion[i].length;
            System.out.println("Promedio alumno " + (i + 1) + ": " + promedio);
        }
        System.out.println();
    }

   //Calcula el promedio de cada materia
    public static void PromedioMateria(double[][] calificacion) {
        System.out.println("======== PROMEDIO POR MATERIA ========");
        for (int j = 0; j < calificacion[0].length; j++) {
            double suma = 0;
            for (int i = 0; i < calificacion.length; i++) {
                suma += calificacion[i][j];
            }
            double promedio = suma / calificacion.length;
            System.out.println("Promedio materia " + (j + 1) + ": " + promedio);           
        }
        System.out.println();
    }
}   
