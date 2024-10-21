public class Japones extends Castelo {
    int numSamurai;

    public Japones(int defesa, int pontosDeVida, String nome, int numSamurai) {
        super(defesa, pontosDeVida, nome);
        this.numSamurai = numSamurai;
    }

    public int getNumSamurai() {
        return numSamurai;
    }

    public void setNumSamurai(int numSamurai) {
        this.numSamurai = numSamurai;
    }

    public String situacao() {
        return super.sitacao() + " Nº de Samurais: " + numSamurai;
    }

    public boolean ataque(int d) {
        if (d > numSamurai) {
            numSamurai = 0;
            if (super.ataque(d)) {
                numSamurai += 15;
                return true;
            } else {
                return false;
            }
        } else {
            numSamurai -= d;
            return true;
        }
    }
}
