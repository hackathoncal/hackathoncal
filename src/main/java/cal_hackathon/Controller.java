package cal_hackathon;

import cal_hackathon.business_logic.Application;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Israel Heiblum
 */

@RestController
public class Controller {
    Application app = new Application();
    @RequestMapping("/")
    public String index() {
        return this.app.appActions();
    }
}
