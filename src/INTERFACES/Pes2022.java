package INTERFACES;

public class Pes2022 implements Gamecenter{
    public void getNombreGamecenter() {
        System.out.println("Este juego es Pes 2022");
    }

    @Override
    public int getDifficulty() {
        System.out.println("Dificultad de Pes 2022");
        return 0;
    }
}
