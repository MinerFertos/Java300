public class Ejercicio1 {
    public static void main(String[] args) {
        String cyan="\033[36m";
        String reset="\u001B[0m";
        System.out.println("\033[36m             ☀ |Horario|  ☀" );

        System.out.printf("\033[36mLunes  Martes  Miercóles  Jueves  Viernes\n ");
        System.out.printf("\u001B[0m -----------------------------------------\n");
        System.out.printf("Prog\t  Badat\t    Prog\t  Endes\t   S.Infor\n");
        System.out.printf("Prog\t  Badat\t    Prog\t  Endes\t   S.Infor\n");
        System.out.printf("S.Infor\t L.Marca\tFol\t      Prog\t     Fol\n");
        System.out.printf("Fol\t     L.Marca\tS.Infor\t  Digit.\tSost.");

    }
}