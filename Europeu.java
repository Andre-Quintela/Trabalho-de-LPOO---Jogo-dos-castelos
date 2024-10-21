public class Europeu extends Castelo {
    int numPaladino; 

    public Europeu(int defesa, int pontosDeVida, String nome, int numPaladino) {
        super(defesa, pontosDeVida, nome);
        this.numPaladino = numPaladino;
    }

    public int getNumPaladino() {
        return numPaladino;
    }

    public void setNumPaladino(int numPaladino) {
        this.numPaladino = numPaladino;
    }

    public String situacao() {
        return super.sitacao() + " Nº de paladinos: " + numPaladino;
    }

    public boolean ataque(int d) {
        if (d > numPaladino) {
            numPaladino = 0;
            if (super.ataque(d)) {
                numPaladino += 10;
                return true;
            } else {
                return false;
            }
        } else {
            numPaladino -= d;
            return true;
        }        
    }
}