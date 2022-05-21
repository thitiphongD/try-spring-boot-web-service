package web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cashier {
    @RequestMapping("/total")
    String m1(String price) {
        try {
            double p = Double.valueOf(price);
            if (p >= 100) return "" + p * 0.95;
            return "" + p;
        } catch (Exception e) {
            return "Invalid";
        }
    }
}
