package main.java.org.example;

/**
 * Zoom class implements its accept method.
 */
public class Zoom implements Modem {

  /**
   * Accepts all visitors but honors only ZoomVisitor.
   */
  @Override
  public void accept(ModemVisitor modemVisitor) {
    if (modemVisitor instanceof ZoomVisitor) {
      ((ZoomVisitor) modemVisitor).visit(this);
    } else {
      System.out.println("Only ZoomVisitor is allowed to visit Zoom modem");
    }
  }

  /**
   * Zoom modem's toString method.
   */
  @Override
  public String toString() {
    return "Zoom modem";
  }
}
