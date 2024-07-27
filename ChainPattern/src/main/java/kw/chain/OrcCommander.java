package kw.chain;

public class OrcCommander implements RequestHandler{
    @Override
    public boolean canHandleRequest(Request req) {
        return req.getRequestType() == RequestType.DEFEEND_CASTLE;
    }

    @Override
    public int getPriority() {
        return 2;
    }

    @Override
    public void handle(Request req) {
        req.markHandled();
        System.out.println("handling request");
    }

    @Override
    public String name() {
        return "Orc commander";
    }
}
