import java.util.InputMismatchException;
import java.util.Scanner;

public class WikiBatiz {
  static boolean activo = true;
  static boolean reinicio = false;

      public static void main(String[] args){
            ImprimirNombre();
            Separacion();
      }
  
      public static int NumRango(String[] opciones, int minimo, int maximo) {
        int numIngresado = LeerNum();
        boolean bandera = (numIngresado < minimo) || (numIngresado > maximo);
        while (bandera) {
            Separacion();
            System.out.println("Ingresa un valor valido segun el menu");
            Separacion();
            for (int i = 0; i < opciones.length; i++) {
                System.out.println(opciones[i]);
            }
            Separacion();
            numIngresado = LeerNum();
            if (numIngresado >= minimo && numIngresado <= maximo) {
                bandera = false;
            }
        }
        Separacion();
        return numIngresado;
    }

    public static int LeerNum() {
        int num = 0;
        Scanner leer = new Scanner(System.in);
        try {
            num = leer.nextInt();
            return num;
        } catch (InputMismatchException e) {
            Separacion();
            System.out.println("Error, no haz ingresado un numero");
            leer.next();
        }
        return num;
    }

    public static void Separacion() {
        for (int i = 0; i < 150; i++) {
            System.out.print("_");
        }
        System.out.println('\n');
    }

    public static void ImprimirNombre() {
        System.out.println(" _____________________________________________________________________________________________________________");
        System.out.println("|                                                                                                             |");
        System.out.println("|      :::       ::: ::::::::::: :::    ::: ::::::::::: :::::::::      ::: ::::::::::: ::::::::::: ::::: :::: |");
        System.out.println("|     :+:       :+:     :+:     :+:   :+:      :+:     :+:    :+:   :+: :+:   :+:         :+:          :+:    |");
        System.out.println("|    +:+       +:+     +:+     +:+  +:+       +:+     +:+    +:+  +:+   +:+  +:+         +:+         +:+      |");
        System.out.println("|   +#+  +:+  +#+     +#+     +#++:++        +#+     +#++:++#+  +#++:++#++: +#+         +#+        +#+        |");
        System.out.println("|  +#+ +#+#+ +#+     +#+     +#+  +#+       +#+     +#+    +#+ +#+     +#+ +#+         +#+       +#+          |");
        System.out.println("|  #+#+# #+#+#      #+#     #+#   #+#      #+#     #+#    #+# #+#     #+# #+#         #+#      #+#            |");
        System.out.println("|  ###   ###   ########### ###    ### ########### #########  ###     ### ###     ########### #########        |");
        System.out.println("|                                                                                                             |");
        System.out.println("|_____________________________________________________________________________________________________________|");
        System.out.println('\n');
    }
}
