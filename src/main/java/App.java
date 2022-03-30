import Controllers.AutomobiliController;
import ElasticSearch.ElasticClient;
import io.javalin.Javalin;


public class App {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(3001);
        ElasticClient.getElasticSearchClientInstance();
        AutomobiliController aContronller = new AutomobiliController();
        app.get("/", aContronller::getAllAutomobils);

    }
}
