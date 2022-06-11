package web;


import java.util.ArrayList;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Whatever{
    @RequestMapping("/week/get-weekend")
    ArrayList m2(){
        ArrayList a = new ArrayList();
        a.add("Saturday");
        a.add("Sunday");
        a.add(7);
        a.add(8.5);
        return a;
    };
    
    
    @RequestMapping("/week/get-all")
    String[] m1(){
//        String[] a = new String[3];
//        a[1] = "Tuesday";
        String[] a = new String[] {"Monday","Tuesday",null,null};
        return a;
    }
}
