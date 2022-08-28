package design_patterns.j2ee.intercepting_filter_pattern;

public class AuthenticationFilter implements Filter {

    @Override
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }
}
