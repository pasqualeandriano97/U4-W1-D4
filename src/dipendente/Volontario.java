package dipendente;

public class Volontario implements CeckIn {
    private String nome;
    private int età;
    private String CV;

    public Volontario(String nome, int età, String CV) {

        this.nome = nome;
        this.età = età;
        this.CV = CV;
    }

    @Override
    public void checkIn() {
        System.out.println("Il volontario " + nome + " incomincia a lavorare alle 9:00 AM");
        System.out.println("Il volontario " + nome + " termina di lavorare alle 01:00 PM");
    }

    @Override
    public String toString() {
        return "Volontario{" +
                "nome='" + nome + '\'' +
                ", età=" + età +
                ", CV='" + CV + '\'' +
                '}';
    }
}
