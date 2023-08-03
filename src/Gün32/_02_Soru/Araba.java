package Gün32._02_Soru;

import java.io.StringReader;

public class Araba {
    private String renk;
    private int model;
    private int motorHacmi;
    private int kapıSayısı;

    public Araba() {
    }

    public Araba(String renk,int model,int motorHacmi,int kapıSayısı) {
        setRenk(renk);
        setModel(model);
        setMotorHacmi(motorHacmi);
        setKapıSayısı(kapıSayısı);
      //  this.renk = renk;
      //  this.model=model;
      //  this.motorHacmi=motorHacmi;
      //  this.kapıSayısı=kapıSayısı;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "renk='" + renk + '\'' +
                ", model=" + model +
                ", motorHacmi=" + motorHacmi +
                ", kapıSayısı=" + kapıSayısı +
                '}';
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(int motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    public int getKapıSayısı() {
        return kapıSayısı;
    }

    public void setKapıSayısı(int kapıSayısı) {
        if (kapıSayısı<7)
        this.kapıSayısı = kapıSayısı;
        else
            System.out.println("hatalı giriş");
    }
}
