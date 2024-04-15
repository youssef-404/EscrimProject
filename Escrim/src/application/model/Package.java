package application.model;

import application.model.util.Dim3D;

import java.util.ArrayList;
import java.util.List;

public class Package {
    private int id;
    private String affectaire;
    private String secteur;
    private String observation;
    private Dim3D dim;
    private float weight;
    private List<Item> items;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAffectaire() {
        return affectaire;
    }

    public void setAffectaire(String affectaire) {
        this.affectaire = affectaire;
    }

    public String getSecteur() {
        return secteur;
    }

    public void setSecteur(String secteur) {
        this.secteur = secteur;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public Dim3D getDim() {
        return dim;
    }

    public void setDim(Dim3D dim) {
        this.dim = dim;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
