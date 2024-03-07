package dipendente;

public abstract class Dipendente implements CeckIn {
    private int matricola;
    private int stipendio;
    private dipartimento dipartimento;

    public Dipendente(int matricola, int stipendio, dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }


    public int getMatricola() {
        return matricola;
    }

    public int getStipendio() {
        return stipendio;
    }

    public dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(dipendente.dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public abstract void calculateSalary();

    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola=" + matricola +
                '}';
    }
}
