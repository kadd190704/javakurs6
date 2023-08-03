package Gün35._01_Final.method;

public class Araçlar {
    private String model;

    public Araçlar(String model) {
        this.model = model;
    }
    public final void setKilometre(){
        System.out.println("gösterge set edildi");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Araçlar{" +
                "model='" + model + '\'' +
                '}';
    }
}
