package ro.uvt.models;

import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class Carte extends Section implements Visitee{
    // Atribute------------------------------------
    private List<Autor> autori;//agregare

    public Carte(List<Autor> autori, String titlu) {
        super(titlu);
        this.autori = autori;

    }

    public String getTitlu(){return getSectionTitle();}

    public void setTitlu(String titlu){
        this.setSectionTitle(titlu);
    }

    public List<Autor> getAutori() {
        return autori;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visitBook(this);
    }

    }



