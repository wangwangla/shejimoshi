package main.java.org.example;

public class Hayes implements Modem{
    @Override
    public void accept(ModemVisitor modemVisitor) {
        if (modemVisitor instanceof HayesVisitor) {
            ((HayesVisitor) modemVisitor).visit(this);
        }
    }
}
