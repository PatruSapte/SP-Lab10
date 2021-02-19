package ro.uvt.commands;


import ro.uvt.models.Carte;

public class DocumentManager {
    public DocumentManager instance;
    private Carte carte;

    public DocumentManager getInstance() {
        return instance;
    }

    public Carte getCarte() {
        return carte;
    }

    public void setCarte(Carte carte) {
        this.carte = carte;
    }
}
