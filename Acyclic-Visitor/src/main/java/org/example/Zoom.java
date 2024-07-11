package main.java.org.example;

public class Zoom implements Modem{
    @Override
    public void accept(ModemVisitor modemVisitor) {
        if (modemVisitor instanceof ZoomVisitor){
            ZoomVisitor visitor = (ZoomVisitor) modemVisitor;
            visitor.Visit(this);
        }
    }

    @Override
    public String toString() {
        return "Zoom Modem";
    }
}
