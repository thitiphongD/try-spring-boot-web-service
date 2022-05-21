package web;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Sample {
    
    @RequestMapping("/array-list")
    ArrayList m2() {
        ArrayList a = new ArrayList();
        a.add("String");
        a.add(1);
        a.add(2.0);
        a.add(false);
        return a;
    }
    
    @RequestMapping("/week/get-all")
    String[] m1() {
        String[] a = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "sathurday"};
        return a;
    }
}
