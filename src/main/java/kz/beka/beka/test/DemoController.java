package kz.beka.beka.test;
import kz.beka.beka.test.domain.DemoModel;
import kz.beka.beka.test.service.DemoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DemoController {
    @Autowired
    private DemoServiceImpl service;

    @GetMapping("/hello")
    @ResponseBody
    public String greeting() {
        return service.getModel();
    }

}

