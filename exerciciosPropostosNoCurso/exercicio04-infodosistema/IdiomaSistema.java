import java.util.*;
public class IdiomaSistema {
    public static void main(String args[]) {
        Locale loc = Locale.getDefault(); 
        System.out.printf("Seu sistema está em: %s, %s.\n \n",loc.getDisplayLanguage(),loc.getDisplayCountry());
    }
}
