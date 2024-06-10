
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.LocalDateTime;


public class manipulacao {

    public static void main(String[] args) {
        
        //Olá, {nome}. Hoje é {dia-da-semana}, BOM DIA.

        String nome = "Vitor";
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.length());

        String nomeOutro = "vitor";
        System.out.println(nome.equalsIgnoreCase(nomeOutro));

        // ISO 8601
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt","br");
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,brasil));
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "bom dia";
        } 
        else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "boa tarde";      
        } 
        else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "boa noite";   
        } else {
            saudacao = "qualquer coisa";                                                                        
        }
    
        System.out.printf("Olá, %s. Hoje é %s, %s.%n ", nome, diaSemana, saudacao.toLowerCase());



             

        
        


    }

}

