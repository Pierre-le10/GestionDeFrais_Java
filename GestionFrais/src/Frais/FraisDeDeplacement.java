package Frais;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FraisDeDeplacement {
    // Attributs
    private Date date;
    private String personne;
    private String moyenTransport;
    private double montantEnEuros;
    private double nombreDeKms;

    // Constructeur
    public FraisDeDeplacement(Date date, String personne, String moyenTransport, double montantEnEuros, double nombreDeKms) {
        this.date = date;
        this.personne = personne;
        this.moyenTransport = moyenTransport;
        setMontantEnEuros(montantEnEuros);
        setNombreDeKms(nombreDeKms);
    }

    // Getters et Setters
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPersonne() {
        return personne;
    }

    public void setPersonne(String personne) {
        this.personne = personne;
    }

    public String getMoyenTransport() {
        return moyenTransport;
    }

    public void setMoyenTransport(String moyenTransport) {
        this.moyenTransport = moyenTransport;
    }

    public double getMontantEnEuros() {
        return montantEnEuros;
    }

    public void setMontantEnEuros(double montantEnEuros) {
        // Vérification que le montant est positif
        if (montantEnEuros < 0) {
            throw new IllegalArgumentException("Le montant ne peut pas être négatif.");
        }
        this.montantEnEuros = montantEnEuros;
    }

    public double getNombreDeKms() {
        return nombreDeKms;
    }

    public void setNombreDeKms(double nombreDeKms) {
        // Vérification que le nombre de kilomètres est positif
        if (nombreDeKms < 0) {
            throw new IllegalArgumentException("Le nombre de kilomètres ne peut pas être négatif.");
        }
        this.nombreDeKms = nombreDeKms;
    }

    // Méthode pour convertir le montant en dollars
    public double getMontantEnDollars() {
        // Taux de change (imposé par l'énoncé)
        return montantEnEuros * 1.0763; // 1 euro = 1.0763 dollars
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        // Mise en forme de la date
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        // Retourne le descriptif (avec la date formatée et au format de l'énoncé)
        return personne + " a effectué un déplacement de " + nombreDeKms + " kms le " + sdf.format(date) +
                ".\nIl a voyagé en " + moyenTransport + " pour un coût de " + montantEnEuros + " Euros";
    }

    // Méthode pour obtenir la description en dollars
    public String toStringDollars() {
        return toString() + "\nMontant en dollars : " + getMontantEnDollars();
    }

}
