package dipendente;

public class DipendentePartTime extends Dipendente {

    public DipendentePartTime(int matricola, int stipendio, dipendente.dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public void calculateSalary() {
        System.out.println("Dipendente PartTime");
        System.out.println("Matricola: " + this.getMatricola());
        System.out.println("Stipendio: " + this.getStipendio() / (302 / 5) + "€ per 20 ore settimanali");
        System.out.println("Dipartimento: " + this.getDipartimento());

    }

    @Override
    public void checkIn() {
        System.out.println("Il dipendente " + this.getMatricola() + " incomincia a lavorare alle 8:00 AM");
        System.out.println("Il dipendente " + this.getMatricola() + " termina di lavorare alle 12:00 AM");

    }
}
