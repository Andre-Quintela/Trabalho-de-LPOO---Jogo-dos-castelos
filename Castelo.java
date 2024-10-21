public abstract class Castelo{
    private int defesa;
    private int pontosDeVida;
    private String nome;

    public Castelo(int defesa, int pontosDeVida, String nome) {
        this.defesa = defesa;
        this.pontosDeVida = pontosDeVida;
        this.nome = nome;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String sitacao() {
        return "Nome: " + this.nome + " Pontos de vida: " + this.pontosDeVida + " Defesa: " + this.defesa;
    }

    public boolean ataque(int d){
        if(this.defesa > 0){
            this.defesa--;
            return true;
        }else{
            if(this.pontosDeVida > 0){
                this.pontosDeVida--;
                this.defesa = 2;
                return true;
            }else{
                return false;
            }
        }
    }

}