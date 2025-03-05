package interfaces.HerancaMultipla;

public class Program {
    public static void main(String[] args) {

        Printer p = new Printer("1080");
        p.processDoc("My letter");
        p.print("My letter");

        Scanner s = new Scanner("2003");
        p.processDoc("My Email");
        System.out.println("Scan result: " + s.scan());
    }
}
