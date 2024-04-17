package application.model;

import application.model.util.Dim3D;

import java.util.ArrayList;
import java.util.List;

public class Package {
    private int id;
    private String affectaire;
    private String model;
    private String nominal;
    private String type;
    private String secteur;
    private Dim3D dim;
    private float weight;
    private float volume;
    private List<Item> items;


}
