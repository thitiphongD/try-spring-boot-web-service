package web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Test {
    @RequestMapping("/test")
    String m1(String s) {
        char[] a = s.toCharArray();
        int left = 0;
        int right = a.length-1;
        while (left <= right) {
            boolean x = check(a[left]);
            boolean y = check(a[right]);
            if (x == true && y == true) {
                char tmp = a[left];
                a[left] = a[right];
                a[right] = tmp;
                left++;
                right--;
            }
            if (x == true && y == false) {
                right--;
            }
            if (x == false && y == true) {
                left++;
            }
            if (x == false && y == false) {
                left++;
                right--;
            }
        }
        return new String(a);
    }
    
    boolean check(char x) {
        if (x == 'A') return true;
        if (x == 'E') return true;
        if (x == 'I') return true;
        if (x == 'O') return true;
        if (x == 'U') return true;
        return false;
    }
}
