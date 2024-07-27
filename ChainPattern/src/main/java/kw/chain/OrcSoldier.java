package kw.chain;

public class OrcSoldier implements RequestHandler{
    @Override
    public boolean canHandleRequest(Request req) {
        return false;
    }

    @Override
    public int getPriority() {
        return 1;
    }

    @Override
    public void handle(Request req) {
        req.markHandled();
        System.out.println("handling request");
    }

    @Override
    public String name() {
        return "Orc ";
    }
}
