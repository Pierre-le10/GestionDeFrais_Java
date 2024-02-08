import Frais.FraisDeDeplacement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {
        // Mise en forme de la date
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        // Création d'un frais correspondant à l'exemple
        Date date1 = sdf.parse("08/02/2024");
        FraisDeDeplacement f1 = new FraisDeDeplacement(date1, "John Smith", "train", 125.5, 178);

        // Création d'un second frais
        Date date2 = sdf.parse("12/12/2023");
        FraisDeDeplacement f2 = new FraisDeDeplacement(date2, "Emma", "à pieds", 0, 8);
        
        // Affichage des descriptifs dans la console
        System.out.println(f1);
        System.out.println(f2);

        // Affichage des descriptifs avec les montants convertis en dollars
        System.out.println(f1.toStringDollars());
        System.out.println(f2.toStringDollars());
    }
}
