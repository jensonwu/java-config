import java.util.Map;

public class TestEcho {

    public static void main(String[] args) {
        Map<String, String> env = System.getenv();
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n",
                    envName,
                    env.get(envName));
        }
        for (String s : args) {
            System.out.println(s);
        }
    }

}
