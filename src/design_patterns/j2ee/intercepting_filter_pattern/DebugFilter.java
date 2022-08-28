package design_patterns.j2ee.intercepting_filter_pattern;

public class DebugFilter implements Filter {

    @Override
    public void execute(String request) {
        System.out.println("request log: " + request);
    }
}
