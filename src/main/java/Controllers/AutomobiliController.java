package Controllers;

import Services.AutomobiliService;
import io.javalin.http.Context;
import io.javalin.plugin.json.JavalinJackson;

import java.io.IOException;

public class AutomobiliController {
    private final AutomobiliService service = new AutomobiliService();

    public void getAllAutomobils(Context context) throws IOException {
        var result = service.getAllAutomobili();
        var stringifyResult = new JavalinJackson().toJsonString(result);
        context.result(stringifyResult);
    }
}
