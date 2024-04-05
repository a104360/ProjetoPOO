package entidades;


/**
 * Super Classe. Possui o objetivo de identificar o tipo de entidade estamos a referir com as suas subclasses
 * @author David Figueiredo
 */
public class Entidade {
    private int id;
    public static final int ATVD = 1;
    public static final int USER = 2;
    public static final int PLANO = 3;

    /**
     * Construtor vazio. Por defeito, a entidade é inicializada como sendo uma Atividade
     * @return Instância de Entidade
     */
    public Entidade(){
        this.id = ATVD;
    }

    /**
     * Construtor parameterizado.
     * <pre>
     * Inicializa a instancia com o tipo passado no parametro.
     * </pre>
     * @param id Opçoões entre {@code Entidade.ATVD , Entidade.USER , Entidade.PLANO}.
     * @return Instância de Entidade
     */
    public Entidade(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    /**
     * @title Método de igualdade entre 2 entidades.
     * @param e
     * É efetuada a comparação dos ids
     * @return
     */
    public boolean equals(Entidade e) {
        if(e.id == this.id) return true;
        return false;
    }

    /**
     * @title Método toString()
     * @return Consoante o caso retorna "Atividade" , "User" ou "PLANO"
     */
    @Override
    public String toString() {
        switch (this.id) {
            case ATVD:
                return "Atividade";
            case USER:
                return "User";
            case PLANO:
                return "PLANO";
            default:
                return null;
        }
    }
}
