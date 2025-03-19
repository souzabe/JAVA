package heranca;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class heranca {
    public static void main(String[] args) {
        double valor = 1234.56;

        // Configura o símbolo decimal para ponto
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols(Locale.US);
        simbolos.setDecimalSeparator(',');

        //Aplica  formato desejado
        DecimalFormat formato = new DecimalFormat("#.##", simbolos);
        String valorFormatado = formato.format(valor);

        System.out.println("Valor formatado: " + valorFormatado);
    }
}
