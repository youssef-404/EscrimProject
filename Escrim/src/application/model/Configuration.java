package application.model;

import java.util.ArrayList;
import java.util.List;

public class Configuration {
    private int id;
    private String name;
    private String catastrophe;
    private int semaines;
    private List<Plane> avions;
    private List<Package> colis;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatastrophe() {
        return catastrophe;
    }

    public void setCatastrophe(String catastrophe) {
        this.catastrophe = catastrophe;
    }

    public int getSemaines() {
        return semaines;
    }

    public void setSemaines(int semaines) {
        this.semaines = semaines;
    }

    public List<Plane> getAvions() {
        return avions;
    }

    public void setAvions(List<Plane> avions) {
        this.avions = avions;
    }

    public List<Package> getColis() {
        return colis;
    }

    public void setColis(List<Package> colis) {
        this.colis = colis;
    }
}
