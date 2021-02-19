package ro.uvt.services;
import ro.uvt.models.*;

import java.util.List;
import java.util.stream.Collectors;

public class JSONVisitor implements Visitor<String> {
    @Override
    public String visitBook(Carte c) {
        String autori = c.getAutori().stream().map(autor -> autor.getNume()).collect(Collectors.joining(","));
        String s = String.format("{\"autori\":[%s], \"details\":%s}", autori, c.getSectionTitle());
        return s;
    }

    @Override
    public String visitSection(Section s) {

        return null;
    }

    @Override
    public String visitParagraph(Paragraph p) {
        if (p.getTextAlignment() != null) {
            String s = String.format("{\"text\": \"%s\", \"alignment\": \"%s\" }", p.getText(), p.getTextAlignment());
            return s;
        } else {
            String s = String.format("{\"text\": \"%s\", \"alignment\": \"%s\" }", p.getText(), "No text alignment");
            return s;
        }
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


///////////////////////////////////////////////
}