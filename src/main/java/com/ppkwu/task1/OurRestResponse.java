package com.ppkwu.task1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pawel.welfle
 */
@RestController
public class OurRestResponse {

    @RequestMapping("/reverse")
    public String revString(String word) {
        word = "Test";
        return word;
    }
}
