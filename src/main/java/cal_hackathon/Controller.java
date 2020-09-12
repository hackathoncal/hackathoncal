package cal_hackathon;

import cal_hackathon.business_logic.Application;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CAL-GROUP
 */

@RestController
public class Controller {
    Application app = new Application();
    @RequestMapping("/")
    public String index() {
        return this.app.appActions();
    }

    @CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
    @RequestMapping(value = "countPlus" +
                            "/{num}", method = RequestMethod.GET, produces = MediaType.ALL_VALUE)
    public  int countPlus(@PathVariable int num) {
       return app.addOne(num);
    }

    @CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
    @RequestMapping(value = "countMinus" +
                            "/{num}", method = RequestMethod.GET, produces = MediaType.ALL_VALUE)
    public  int countAdd(@PathVariable int num) {
        return app.subtractOne(num);
    }
}
