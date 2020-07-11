/*
 * Diseño e implementación de un algoritmo que le permita detectar las fallas
de un sensor de temperatura y presión, considerando las intensidades normales
del sensor.
 */
package paperfallasensor;

/**
 *
 * @author VEGA MASAPANTA JESSICA MARIBEL
 */
import java.util.Scanner;
public class PaperFallaSensor {

//SERVICIO 3
     public static String Verificar_Intensidad_Funcionamiento(){

        Scanner objeto=new Scanner (System.in);
        String tipo_sensor;

        System.out.println("\n Ingrese el tipo de sensor");
        tipo_sensor=objeto.nextLine();

        return tipo_sensor;
    }

//SERVICIO 4
     public static int Especificar_Falla_Aceleracion(){

        Scanner objeto=new Scanner (System.in);
        int angulo_aceleracion;

        System.out.println("\n Especifique el angulo de aceleración");
        angulo_aceleracion=objeto.nextInt();

        return angulo_aceleracion;
    }

//SERVICIO 2
     public static int Describir_Factor_Multiplicador_Falla(){

        Scanner objeto=new Scanner (System.in);
        int rango_factor_multiplicador;

        System.out.println("\n Ingrese el rango del factor multiplicador");
        rango_factor_multiplicador=objeto.nextInt();

        return rango_factor_multiplicador;
    }

//SERVICIO 1
    public static String Leer_Intensidad(){

        Scanner objeto=new Scanner (System.in);
        String tipo_falla;

        System.out.println("\n Ingrese el tipo de falla");
        tipo_falla=objeto.nextLine();

        return tipo_falla;
    }

//SERVICIO 5
     public static String Diagnosticar_Falla_Sensor(){

        Scanner objeto=new Scanner (System.in);
        String tamanio_falla;

        System.out.println("\n Diagnostico del tamaño de la falla");
        tamanio_falla=objeto.nextLine();

        return tamanio_falla;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//CARACTERÍSTICAS 3

        String tipo_sensor;
        int nivel_intensidad;
        int grado_falla;
        int falla=0;

        tipo_sensor=Verificar_Intensidad_Funcionamiento();

        Scanner objeto=new Scanner (System.in);
        System.out.println("\n Ingrese el nivel de intensidad");
        nivel_intensidad=objeto.nextInt();

        if(nivel_intensidad>20){
                falla =falla+1;
            System.out.println("El sensor tiene: "+falla+" falla debido a la "
                    + "intensidad de: "+nivel_intensidad+ "%");

        }else{
            falla =falla;
            System.out.println("Como el nivel de intensidad es: "+nivel_intensidad+"% "
                    + "lo que significa que es menor a 20% el sensor tiene: "+falla+ " fallas");

        }
//CARACTERÍSTICAS 4
        int angulo_aceleracion;

       angulo_aceleracion=Especificar_Falla_Aceleracion();

        if(angulo_aceleracion>40){
            falla=falla+1;
            System.out.println("El sensor tiene: "+falla+" falla debido al "
                    + "tamaño del angulo de aceleracion de: "+angulo_aceleracion+ " "
                            + "grados y a la intensidad de "+nivel_intensidad+"%");
        }else{
            falla=falla;
            System.out.println("Como el angulo de aceleracion es: "+angulo_aceleracion+" grados "
                    + "significa que es menor a 40 grados, el sensor tiene: "+falla+ " fallas");
        }

//CARACTERÍSTICAS 2
        int rango_factor_multiplicador;

        rango_factor_multiplicador=Describir_Factor_Multiplicador_Falla();

        if(rango_factor_multiplicador>=1){
            falla=falla+1;
            System.out.println("El rango es muy alto por lo tanto el sensor de "
                    + ""+tipo_sensor+ " tiene "+falla+" fallas por la intensidad "
                            + "y el angulo de aceleracion");
        }else{
            falla=falla;
            System.out.println("El rango es el correcto y el sensor tiene "
                    + ""+falla+ " fallas");
        }

//CARACTERISTICAS 1
        String tipo_falla;

        tipo_falla=Leer_Intensidad();

//CARACTERÍSTICAS 5
        String tamanio_falla;

        tamanio_falla=Diagnosticar_Falla_Sensor();

        if(falla>0){
            System.out.println("\n El sensor de " +tipo_sensor+ " tiene un nivel "
                    + "de intensidad del: " +nivel_intensidad+ "%, un angulo de "
                            + "aceleracion de "+angulo_aceleracion+" y un rango "
                                    + "del factor multiplicador de"
                                    + " "+rango_factor_multiplicador+" por lo tanto "
                            + "tiene "+falla+" fallas");
            System.out.println("El sensor tiene: "+falla+ " fallas de tipo: "+tipo_falla);
            System.out.println("El diagnostico de las "+falla+" fallas es de tamaño: " +tamanio_falla);
        }else{
            System.out.println("El sensor de " +tipo_sensor+ " tiene " +falla+ " fallas");
        }

    }

}
