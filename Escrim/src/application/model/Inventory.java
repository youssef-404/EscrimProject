package application.model;

import java.util.ArrayList;
import java.util.List;

class Inventory {
    private List<Package> packages;

    public Inventory() {
        packages = new ArrayList<>();
    }

    public void addItem(Package c) {
        packages.add(c);
    }

    public void RemoveItem(Package c) {
        packages.remove(c);
    }

    public List<Package> getPackages() {
        return packages;
    }

    public void printItems() {
        for (Package item : packages) {
            System.out.println(item);
        }
    }
}

