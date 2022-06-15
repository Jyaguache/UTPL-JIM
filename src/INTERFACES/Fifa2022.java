package INTERFACES;

public class Fifa2022 implements Gamecenter{

    public void getNombreGamecenter() {
        System.out.println("Este juego es Fifa 2022");
    }

    @Override
    public int getDifficulty() {
        System.out.println("\"Dificultad de Fifa 2022");
        return 0;
    }
}
