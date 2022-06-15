// CLASE
public class Juego {
    //Atributos
    private String namegame;
    private String difficulty;


    //Constructores - inicializan variables, dan valores
    public Juego (String namegame, String difficulty){
        this.namegame = namegame;
        this.difficulty = difficulty;
    }
    //Metodos, funciones, acciones
    public void setNamegame(String namegame){
        this.namegame = namegame;
    }
    public String getNamegame(String namegame) {
        return this.namegame;
    }
}
