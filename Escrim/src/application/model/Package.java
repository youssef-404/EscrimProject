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

}
