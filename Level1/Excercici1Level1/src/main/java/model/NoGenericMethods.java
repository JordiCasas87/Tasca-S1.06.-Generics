package model;

public class NoGenericMethods {

    private String name;
    private String place;
    private String hability;

    public NoGenericMethods(String name, String place, String hability) {
        this.name = name;
        this.place = place;
        this.hability = hability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getHability() {
        return hability;
    }

    public void setHability(String hability) {
        this.hability = hability;
    }

    @Override
    public String toString() {
        return "NoGenericMethods{" +
                "name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", hability='" + hability + '\'' +
                '}';
    }
}

