public class numerico {
    public static void main(String[] args) {
        // 1 2 3 4 5 6 7 8 9 10
        // para uma variavel que inicia em 1, e vai ate 10, mudanda 1-por-1, faca:
        for (int i = 1; i <= 10; i = i+1){
             System.out.println(i);
            for (int j = 1; j <= 20; j++){
                int multiplicacao = i*j;
                System.out.println(""+j+"x"+i+"="+multiplicacao);
                


            }

        }                            

        
    }

}
