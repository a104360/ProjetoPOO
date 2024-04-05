package entidades;


public class Atividade extends Entidade{
    private int duracao;
    private boolean hard;
    private int calorias;
    private boolean profissional;
    private int mediaCardio;
    
    
    public Atividade() {
        this.duracao = 0;
        this.hard = false;
        this.calorias = 0;
        this.profissional = false;
        this.mediaCardio = 0;
    }
    
    public Atividade(int duracao) {
        this.duracao = duracao;
        this.hard = false;
        this.calorias = 0;
        this.profissional = false;
        this.mediaCardio = 0;
    }
    
    public Atividade(int duracao,boolean hard,int calorias,boolean profissional,int mediaCardio){
        this.duracao = duracao;
        this.hard = hard;
        this.calorias = calorias;
        this.profissional = profissional;
        this.mediaCardio = mediaCardio;
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
    public int getmediaCardio() {
        return mediaCardio;
    }
    public void setmediaCardio(int mediaCardio) {
        this.mediaCardio = mediaCardio;
    }
    
    @Override
    public String toString() {
        return "Atividade [duracao=" + duracao + ", hard=" + hard + ", calorias=" + calorias + ", profissional="
                + profissional + ", mediaCardio=" + mediaCardio + "]";
    }

    

}