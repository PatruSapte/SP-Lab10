package ro.uvt;

import ro.uvt.commands.Command;
import ro.uvt.commands.OpenCommand;
import ro.uvt.commands.SaveCommand;
import ro.uvt.models.*;
import ro.uvt.services.RenderContentVisitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AltMain {
    public static void main(String[] args)
    {
        Section cap1 = new Section("Cap 1");

        Paragraph p1 = new Paragraph("Paragraph 1", "Text1");
        cap1.add(p1);

        Paragraph p2 = new Paragraph("Paragraph 2", "Text2");
        cap1.add(p2);

        Paragraph p3 = new Paragraph("Paragraph 3", "Text3");
        cap1.add(p3);

        Paragraph p4 = new Paragraph("Paragraph 4", "Text4");
        cap1.add(p4);

        Autor a1 = new Autor("Creanga");
        List<Autor> la = new ArrayList<>();
        la.add(a1);
        Carte c = new Carte(la,"Carte1");
        c.add(cap1);
        Command command = new SaveCommand(c,"savePath.json");
        command.execute();

    }

}