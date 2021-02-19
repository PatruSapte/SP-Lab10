package ro.uvt.models;

public interface Visitor<T> {

    T visitBook(Carte c);
    T visitSection(Section s);
    //void visitTableOfContents(TableOfContents tContents);
    T visitParagraph(Paragraph p);
    T visitImageProxy(ImageProxy imgProxy);
    T visitImage(Imagine img);
    T visitTable(Tabel table);



}
