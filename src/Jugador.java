// CLASE
public class Jugador {
    //Atributos
    private String nickname;
    private String level;


    //Constructores - inicializan variables, dan valores
    public Jugador (String nickname, String level){
        this.nickname = nickname;
        this.level = level;
    }
    //Metodos, funciones, acciones
    public void setNickname(String nickname){
        this.nickname = nickname;
    }
    public String getNickname(String nickname) {
        return this.nickname;
    }
}