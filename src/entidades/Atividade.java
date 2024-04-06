package entidades;


public class Atividade{
    private int duracao;
    private boolean hard;
    private int caloriasConsumidas;
    private boolean profissional;
    private int mediaCardio;
    
    
    public Atividade() {
        this.duracao = 0;
        this.hard = false;
        this.caloriasConsumidas = 0;
        this.profissional = false;
        this.mediaCardio = 0;
    }
    
    public Atividade(int duracao) {
        this.duracao = duracao;
        this.hard = false;
        this.caloriasConsumidas = 0;
        this.profissional = false;
        this.mediaCardio = 0;
    }
    
    public Atividade(int duracao,boolean hard,int caloriasConsumidas,boolean profissional,int mediaCardio){
        this.duracao = duracao;
        this.hard = hard;
        this.caloriasConsumidas = caloriasConsumidas;
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
    public int getCaloriasConsumidas() {
        return caloriasConsumidas;
    }
    public void setCaloriasConsumidas(int caloriasConsumidas) {
        this.caloriasConsumidas = caloriasConsumidas;
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
        return "Atividade [duracao=" + duracao + ", hard=" + hard + ", caloriasConsumidas=" + caloriasConsumidas + ", profissional="
                + profissional + ", mediaCardio=" + mediaCardio + "]";
    }

    

}