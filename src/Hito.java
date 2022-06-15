// CLASE
public class Hito {
    //Atributos
    private String milestones;
    private String checking;


    //Constructores - inicializan variables, dan valores
    public Hito (String milestones, String checking){
        this.milestones = milestones;
        this.checking = checking;
    }
    //Metodos, funciones, acciones
    public void setMilestones(String milestones){
        this.milestones = milestones;
    }
    public String getMilestones(String milestones){
        return this.milestones;
    }
}