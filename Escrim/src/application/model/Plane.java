package application.model;

import application.model.util.Dim3D;
import application.model.util.Dim2D;

public class Plane {
    private String id;
    private String name;
    private float maxLoad;
    private Dim2D door;
    private Dim3D cargo;
    private float loadRange;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(float maxLoad) {
        this.maxLoad = maxLoad;
    }

    public Dim2D getDoor() {
        return door;
    }

    public void setDoor(Dim2D door) {
        this.door = door;
    }

    public Dim3D getCargo() {
        return cargo;
    }

    public void setCargo(Dim3D cargo) {
        this.cargo = cargo;
    }

    public float getLoadRange() {
        return loadRange;
    }

    public void setLoadRange(float loadRange) {
        this.loadRange = loadRange;
    }
}
