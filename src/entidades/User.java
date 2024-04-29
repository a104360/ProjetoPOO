package entidades;


public class User{
    private int id;
    private String nome;
    private int altura;
    private int peso;
    private int sexo;
    private int idade;
    private String morada;
    private String email;
    private char tipo; // a = amador | p = profissional | o = ocasional
    private int mediaCardio;
    private int caloriasDiarias;
    // inserir atributo para atividades realizadas isoladas
    // inserir atributo para atividades realizadas do plano de treino

    public User(String nome){
        this.id = 1;
        this.nome = nome;
        this.morada = "";
        this.email = "";
        this.tipo = 'o';
        this.mediaCardio = 0;
        this.caloriasDiarias = 2000;
    }
    
    public User(int id, String nome, String morada, String email, char tipo, int mediaCardio) {
        this.id = id;
        this.nome = nome;
        this.morada = morada;
        this.email = email;
        this.tipo = tipo;
        this.mediaCardio = mediaCardio;
        this.caloriasDiarias = this.calculaCalorias();
    }

    public User(int id, String nome, String morada, String email, char tipo, int mediaCardio, int caloriasDiarias) {
        this.id = id;
        this.nome = nome;
        this.morada = morada;
        this.email = email;
        this.tipo = tipo;
        this.mediaCardio = mediaCardio;
        this.caloriasDiarias = caloriasDiarias;
    }


    
    public int getId() {
        return id;
    }
    public User() {
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMorada() {
        return morada;
    }
    public void setMorada(String morada) {
        this.morada = morada;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public char getTipo() {
        return tipo;
    }
    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
    public int getMediaCardio() {
        return mediaCardio;2866.325
    }
    public void setMediaCardio(int mediaCardio) {
        this.mediaCardio = mediaCardio;
    }
    public int getCaloriasDiarias() {
        return caloriasDiarias;
    }
    public void setCaloriasDiarias(int caloriasDiarias) {
        this.caloriasDiarias = caloriasDiarias;
    }
    
    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + altura;
        result = prime * result + peso;
        result = prime * result + sexo;
        result = prime * result + idade;
        result = prime * result + ((morada == null) ? 0 : morada.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + tipo;
        result = prime * result + mediaCardio;
        result = prime * result + caloriasDiarias;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (id != other.id)
            return false;
        return true;
    }
    

    
    

    /* Criar método calcular calorias em funcao do tipo */
    /* imcompleto */
    public int calculaCalorias(){
        // 10*peso+6.25*altura-5*edad-161 F 
        return 10*peso+6.25*altura-5*edad+5; // M
    }
}