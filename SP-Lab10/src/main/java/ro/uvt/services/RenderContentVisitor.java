package ro.uvt.services;

import ro.uvt.models.*;

public class RenderContentVisitor implements Visitor<String> {
    @Override
    public String visitBook(Carte c) {
        System.out.println("Sunt o carte");
        return c.getTitlu();
    }

    @Override
    public String visitSection(Section s) {
        return null;
    }

    @Override
    public String visitParagraph(Paragraph p) {
        return null;
    }

    @Override
    public String visitImageProxy(ImageProxy imgProxy) {
        return null;
    }

    @Override
    public String visitImage(Imagine img) {
        return null;
    }

    @Override
    public String visitTable(Tabel table) {
        return null;
    }
}

