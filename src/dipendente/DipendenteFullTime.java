package dipendente;

public class DipendenteFullTime extends Dipendente {


    public DipendenteFullTime(int matricola, int stipendio, dipendente.dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public void calculateSalary() {
        System.out.println("Dipendente Full Time");
        System.out.println("Stipendio: " + getStipendio() + "€");
        System.out.println("Dipartimento: " + getDipartimento());
        System.out.println("Matricola: " + getMatricola());
        System.out.println("Salario: " + getStipendio() / 12 + "€ per mese");
    }


    @Override
    public void checkIn() {
        System.out.println("Il dipendente " + getMatricola() + " incomincia a lavorare alle 9:00 AM");
        System.out.println("Il dipendente " + getMatricola() + " termina di lavorare alle 01:00 PM");

    }
}
