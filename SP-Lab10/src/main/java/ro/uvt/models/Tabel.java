package ro.uvt.models;

public class Tabel implements Element, Visitee{

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTable(this);
    }
}
