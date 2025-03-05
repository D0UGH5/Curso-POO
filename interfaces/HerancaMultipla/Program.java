package interfaces.HerancaMultipla;

public class Program {
    public static void main(String[] args) {

        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("My letter");
        p.print("My letter");

        ConcreteScanner s = new ConcreteScanner("2003");
        p.processDoc("My Email");
        System.out.println("Scan result: " + s.scan());

        //isso não é herança múltipla, pois não há reuso na relação entre ComboDevice e as interfaces Scanner e Printer.
        //ComboDevice não herda nada, apenas cumpre o contrato das interfaces.
        ComboDevice c = new ComboDevice("2332");
        c.processDoc("My dissertation");
        c.print("My dissertation");
        System.out.println("Scan result: " + c.scan());
    }
}
