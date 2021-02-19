package ro.uvt.commands;

import ro.uvt.models.Carte;
import ro.uvt.models.Paragraph;
import ro.uvt.models.Visitor;
import ro.uvt.services.JSONVisitor;


import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class SaveCommand implements Command{
    private final Carte carte;
    private final String path;
    public SaveCommand(Carte c, String savePath) {
        this.carte = c;
        this.path = savePath;
    }

    @Override
    public void execute() {

        Visitor<String> visit = new JSONVisitor();
        String s = visit.visitBook(carte);

        try(BufferedWriter writer = Files.newBufferedWriter(Paths.get(path)))
        {
            writer.write(s);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
