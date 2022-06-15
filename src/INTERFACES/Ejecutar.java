package INTERFACES;

public class Ejecutar {

    public static void main(String[] args) {

        // Creación objeto Pes2022
        Pes2022 pes2022 = new Pes2022();
        Fifa2022 fifa2022 = new Fifa2022();

        ProcesarGamecenter procesarGamecenter = new ProcesarGamecenter();
        procesarGamecenter.procesarGamecenter (pes2022);
        procesarGamecenter.procesarGamecenter (fifa2022);

        Pes2022A pes2022A = new Pes2022A();
        pes2022A.metodoSinimplementar();
    }
}
