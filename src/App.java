import javax.print.DocFlavor.STRING;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
       
       int a;
       int b = 2;
       a = 3;
       int soma = a + b;
       int subtracao = a - b;
       int multiplicacao = a * b;
       float divisao = (float) a / b;

       System.out.println(" "+ (soma +" "+ subtracao +" "+ multiplicacao +" "+ divisao));

       
     
       boolean fimDeSemana = true;
       boolean fazendoSol = false;
       boolean vamosAPraia = fimDeSemana && fazendoSol;
       System.out.println(vamosAPraia);

       // Tabela verdade
       // Operador && (AND)
       // true && true = true
       // true && false = false
       // false && true = false
       // false && false = false

       // Operador || (OR)

       // true  || true = true
       // true  || false = true 
       // false || true = true
       // false || false = false

       String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
       System.out.println(mensagem);


       int nota = 70;

       // note maior ou igual 70, então aprovado
       // if-else
       if (nota >= 70) {

        System.out.println("Aluno aprovado! ");
       } else {
        System.out.println("Não aprovado.");
       }

       // A 80 B 70 C 60 D 0
       if (nota >= 80) {
        System.out.println("Graduacao A");
     }else if (nota < 80 && nota >=70) {
        System.out.println("Graduacao B");
     }else if (nota < 70 && nota >=60) {
        System.out.println("Graduacao C");
     }else if (nota < 60 && nota>= 0) {
        System.out.println("Graduacao D");
     }else {
        System.out.println("nota invalida!");
     }   

      

      

      
        
     
        
     
        

       
           






       

       





       

    

       

}

}