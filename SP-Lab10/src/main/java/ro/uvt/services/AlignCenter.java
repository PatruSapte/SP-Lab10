package ro.uvt.services;

import javax.naming.Context;

import ro.uvt.models.Paragraph;

public class AlignCenter implements AlignStrategy{
    // TO-DO: ATRIBUTE


    @Override
    public void render(Paragraph p, Context c) {
        System.out.println("Render from AlignRight.");
    }

    @Override
    public void setAlignment(Paragraph p, Context c) {
        System.out.println(p + " has been aligned to the center.");
    }

    @Override
    public String toString() {
        return "center";
    }
}
