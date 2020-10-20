package com.ppkwu.task1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pawel.welfle
 */
@RestController
public class OurRestResponse {

    @GetMapping("/reverse")
    @ResponseBody
    public String revString() {
        String word = "Test";
        return word;
    }
}
