package ro.uvt;
import ro.uvt.models.*;
import ro.uvt.services.*;
public class secondMain{
    public static void main(String[] args) throws Exception {
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);
        cap1.add(new ImageProxy("ImageOne"));
        cap1.add(new Imagine("ImageTwo"));
        cap1.add(new Paragraph("Some text"));
       // cap1.add(new Tabel("Table 1"));
        BookStatistics stats = new BookStatistics();
        //cap1.accept((Visitor) stats);
        stats.printStatistics();
}
}