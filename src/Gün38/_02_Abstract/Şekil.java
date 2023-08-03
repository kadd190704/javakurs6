package Gün38._02_Abstract;

public abstract class Şekil {
    private String name;

    abstract double alan();
    abstract double çevre();

    public void ciz(){
        System.out.println(name +"  şekil çizildi");
    }

    @Override
    public String toString() {
        return "Şekil :" +
                "\nname= " + name+
                "\nAlan= "+ alan()+
                "\nÇevre= "+çevre();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
