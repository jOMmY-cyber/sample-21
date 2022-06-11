package web;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

class Start{
    public static void main(String[] data){
        ApplicationContext context;
        context = SpringApplication.run(Prepare.class);
    }
}

@SpringBootApplication
class Prepare{
    //nothing
}

@RestController
class Sample {
    @RequestMapping("/check")
    double showCheck(){
        return 123.4567;
    }
}  //https://127.0.0.1:8080/check