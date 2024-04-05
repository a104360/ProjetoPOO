package entidades;

public class Atividade extends Entidade{
    private int duracao;
    private boolean hard;
    private int calorias;
    private boolean profissional;
    private int cardio;

    public Atividade(int duracao, boolean hard) {
        this.duracao = duracao;
        this.hard = hard;
    }
    public Atividade(int id, int duracao, boolean hard) {
        super(id);
        this.duracao = duracao;
        this.hard = hard;
    }


    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public boolean isHard() {
        return hard;
    }
    public void setHard(boolean hard) {
        this.hard = hard;
    }
    public int getCalorias() {
        return calorias;
    }
    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
    public boolean isProfissional() {
        return profissional;
    }
    public void setProfissional(boolean profissional) {
        this.profissional = profissional;
    }
    public int getCardio() {
        return cardio;
    }
    public void setCardio(int cardio) {
        this.cardio = cardio;
    }
    
    @Override
    public String toString() {
        return "Atividade [duracao=" + duracao + ", hard=" + hard + ", calorias=" + calorias + ", profissional="
                + profissional + ", cardio=" + cardio + "]";
    }

    

}