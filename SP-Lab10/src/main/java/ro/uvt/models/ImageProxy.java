package ro.uvt.models;

public class ImageProxy implements Element, Visitee {
    String imageName;
    Imagine realImage;

    public ImageProxy(String imageName) {
        this.imageName = imageName;
        this.realImage = null;
    }



    @Override
    public void accept(Visitor visitor) {
        visitor.visitImageProxy(this);
    }
}
