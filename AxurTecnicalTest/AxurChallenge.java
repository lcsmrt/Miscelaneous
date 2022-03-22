import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;

public class DesafioAxur {

	public static void main(String[] args) throws IOException {
		verificaHTML("http://www.mocky.io/v2/5e18df272f00007e0097e1b4");
		verificaHTML("https://www.lastpass.com/pt/features/password-generator");
		verificaHTML("https://www.freecodecamp.org/learn/");
		verificaHTML("https://www.blackfriday.com.br");
		verificaHTML("https://en.wikipedia.org/wiki/Big_Tech#FANG,_FAANG,_and_MAMAA");
	}
	
	public static void verificaHTML(String urlString) throws IOException {
		URL url = new URL(urlString);
        BufferedReader leitorDeHTML = new BufferedReader(new InputStreamReader(url.openStream()));
        String conteudoHTML = leitorDeHTML.lines().collect(Collectors.joining(System.lineSeparator())).toLowerCase();
        
        String[] palavrasChave = {"black friday", "promoção", "senha"};
        String resultado = "safe";
        
        for(int i = 0; i < palavrasChave.length; i++) {
        	if(conteudoHTML.contains(palavrasChave[i])) {
        		resultado = "suspicious";
        		break;
        	}
        }
        System.out.println(resultado);
	}
}