
package pkgswitch;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        System.out.println("Digite o dia da semana: ");
        
        Scanner input = new Scanner (System.in);
        
        String dia = input.nextLine();
        
        input.close();
        
        String resultado = "";
        switch(dia){
            case "Segunda":
                resultado = "Dia útil";
                break;
            case "Terça":
                resultado = "segundo dia útil";
                break;
            case "Quarta":
                resultado = "Terceiro dia útil";
                break;
            case "Quinta":
                resultado = "Quarto dia útil";
                break;
            case "Sexta":
                resultado = "sextouuuu";
                break;
            case "Sábado":
                resultado = "último dia da semana!!!";
                break;
            default:
                resultado = "dia inválido";
        }
        
        System.out.println(resultado);
        
        System.out.println("\n");
        
        // segunda forma de fazer essa estrutura
        // essa forma é até mais enchuta
        
        String resultado2 = "";
        resultado2 = switch (dia){
            case "Segunda" -> "Dia útil";
            case "Terça" -> "Terça boa";
            case "Quarta" -> "Quarta boa";
            case "Quinta" -> "quinta boa";
            case "sexta" -> "sexta boa";
            case "sábado" -> "sábado bom";
            default -> "dia inválido";
        
            };
        
        System.out.println(resultado2);
        System.out.println("\n");
        
        // também poderia ser feito dessa forma, e o código ficaria ainda mais enchuto
        resultado = switch (dia){
            case "Segunda", "Terça", "Quarta", "Quinta", "Sexta" -> "DIA ÚTIL";
            case "Sábado", "Domingo" -> "FINAL DE SEMANA";
            default -> "Dia inválido";
        };
        
        System.out.println(resultado);
        
      
        
       }
    
}
