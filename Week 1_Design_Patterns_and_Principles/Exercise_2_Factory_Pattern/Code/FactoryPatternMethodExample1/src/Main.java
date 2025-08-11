//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Document wordDocx = DocumentFactory.getDocument("word");
        wordDocx.printDocument();
        Document pdfDocx = DocumentFactory.getDocument("pdf");
        pdfDocx.printDocument();
        Document excelDocx = DocumentFactory.getDocument("excel");
        excelDocx.printDocument();
    }
}