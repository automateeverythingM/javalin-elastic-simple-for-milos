package Model;

public class Automobil {
    String name;
    String marka;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Override
    public String toString() {
        return "Automobil{" +
                "name='" + name + '\'' +
                ", marka='" + marka + '\'' +
                '}';
    }
}
