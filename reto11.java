import java.util.Scanner;

public class reto11 {
    public static void main (String [] args){
    
    int notas =0;
    int notasC =0; // Cantidad de notas
    int notasG; //Guarde las notas
    int num;
    int promedio;
    Scanner lector= new Scanner (System.in);
    
    for(int i=0; i<notasC; i++;){
        System.out.println ("Ingresa la cantidad de notas que quieres evaluar:");
        notasC= lector.nextInt();
    
    }
    System.out.println ("Ingresa las notas que quieres evaluar en numeros enteros :");
    notas= lector.nextInt();

    if (notas<=3){
    System.out.println("Reprobaste");
    }
    else if (notas>=3&&4){
    System.out.println("Pasaste raspando");
    }
    else (notas>=4){
    System.out.println("Aprobaste con buenos resultados");
    }
    promedio = lector.nextInt();
    promedio = notas / notasC;
    System.out.println("El promedio es:"+promedio);
    }
    }
    


