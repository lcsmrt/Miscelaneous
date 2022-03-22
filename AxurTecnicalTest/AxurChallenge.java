import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;

public class AxurChallenge {

	public static void main(String[] args) throws IOException {
		URL url = new URL(args[0]);
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