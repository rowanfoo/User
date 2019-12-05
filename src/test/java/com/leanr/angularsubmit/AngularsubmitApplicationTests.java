package com.leanr.angularsubmit;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SpringBootTest
class AngularsubmitApplicationTests {

    @Test
    void contextLoads() {
        String zz = "30<14";
        Pattern r = Pattern.compile("<|>|=");
        Matcher m = r.matcher(zz);
        while (m.find()) {
            System.out.println("Start index: " + m.start());
            System.out.println("----------------" + zz.substring(0, m.start()));
            System.out.println("----------------" + zz.substring(m.start(), m.end()));
            System.out.println("----------------" + zz.substring( m.end(),zz.length()  ));
            System.out.println(" End index: " + m.end());
            System.out.println(" Found: " + m.group());
        }


    }

}
