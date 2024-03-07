import dipendente.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Dipendente d1 = new DipendenteFullTime(1234, 100, dipartimento.PRODUZIONE);
        Dipendente d2 = new DipendentePartTime(4321, 100, dipartimento.AMMINISTRAZIONE);
        Dipendente d3 = new Dirigente(5678, 100, dipartimento.VENDITE);
        Volontario v1 = new Volontario("Mario Rossi", 30, "cv.png");
        Volontario v2 = new Volontario("Mario Bianchi", 30, "cv.png");
        Volontario v3 = new Volontario("Mario Verdi", 30, "cv.png");

        Dipendente[] dipendenti = {d1, d2, d3};
        for (Dipendente dipendente : dipendenti) {
            System.out.println(dipendente.toString());
            dipendente.calculateSalary();
        }
        int totale = 0;
        for (Dipendente dipendente : dipendenti) {

            totale += dipendente.getStipendio();


        }
        CeckIn[] dipendenti2 = {d1, d2, d3, v1, v2, v3};
        System.out.println("Totale degli stipendi: " + totale);

        for (CeckIn dipendente : dipendenti2) {
            System.out.println(dipendente.toString());
            dipendente.checkIn();
        }

    }

}