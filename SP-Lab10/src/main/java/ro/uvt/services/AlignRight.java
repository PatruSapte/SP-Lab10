package ro.uvt.services;

import ro.uvt.models.Paragraph;

import javax.naming.Context;

public class AlignRight implements AlignStrategy{
    // TO-DO: ATRIBUTE


    @Override
    public void render(Paragraph p, Context c) {
        System.out.println("Render from AlignRight.");
    }

    @Override
    public void setAlignment(Paragraph p, Context c) {
        System.out.println(p + " has been aligned to the right.");
    }

    @Override
    public String toString() {
        return "right";
    }
}
