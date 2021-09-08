package patterns.singleton;

public class AppConfigurationTest {
    public static void main(String[] args) {

        AppConfiguration configs = AppConfiguration.getConfig();

        System.out.println("Getting configs first time:");
        System.out.println(configs);

        configs = AppConfiguration.getConfig();

        System.out.println("Getting configs second time:");
        System.out.println(configs);

    }
}
