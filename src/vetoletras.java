import java.util.Arrays;

import javax.print.DocFlavor.STRING;

public class vetoletras {
 public static void main(String[] args) {
    
 /* String[] letras = new String[5];
    // [0] [1] [2] [3] [4]
    letras[0] = "A";
    letras[1] = "B";
    letras[2] = "C";
    letras[3] = "J";
    letras[4] = "X";
    for (int i=0; i < letras.length; i++){
        System.out.println(letras[i]);

 } */
 /*  String[] letras = {"A", "B", "C", "J", "X" };
  for (int i=0; i < letras.length; i++){
    System.out.println(letras[i]); 

}
 */
 /* System.out.println(Arrays.toString(letras));
*/

    int[] numeros = {9, 10, 12, 25, 2};
    int maior = numeros[0];
    int menor = numeros[0];
    int media = 0;

    for (int i=0; i < numeros.length; i++){
    if (numeros[i] > maior) {
           maior = numeros [i];
        
      }
      if (numeros [i] < menor ) {
          menor = numeros [i];
        
      }
       media = media +numeros[i];}

       System.out.println("maior:  " + maior);
       System.out.println("menor: " + menor);
       System.out.println("media: " + media/numeros.length);
       
 

}


} 
