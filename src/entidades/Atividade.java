package entidades;

import java.time.LocalDate;

public class Atividade{
    private int duracao;
    private boolean hard;
    private int caloriasConsumidas;
    private boolean profissional;
    private int mediaCardio;
    private int userId;
    private LocalDate data;
    
    
    public Atividade() {
        this.duracao = 0;
        this.hard = false;
        this.caloriasConsumidas = 0;
        this.profissional = false;
        this.mediaCardio = 0;
        this.userId = 0;
        this.data = LocalDate.now();
    }
    
    public Atividade(int duracao, LocalDate data, int userId) {
        this.duracao = duracao;
        this.hard = false;
        this.caloriasConsumidas = 0;
        this.profissional = false;
        this.mediaCardio = 0;
        this.userId = userId;
        this.data = LocalDate.of(2024,4,8);
    }
    
    public Atividade(int duracao,boolean hard,int caloriasConsumidas,boolean profissional,int mediaCardio,int userId, LocalDate data){
        this.duracao = duracao;
        this.hard = hard;
        this.caloriasConsumidas = caloriasConsumidas;
        this.profissional = profissional;
        this.mediaCardio = mediaCardio;
        this.userId = userId;
        this.data = LocalDate.of(2024,4,8);
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
    
    

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Atividade [duracao=" + duracao + ", hard=" + hard + ", caloriasConsumidas=" + caloriasConsumidas
                + ", profissional=" + profissional + ", mediaCardio=" + mediaCardio + ", userId=" + userId + ", data="
                + data + "]";
    }
   

}