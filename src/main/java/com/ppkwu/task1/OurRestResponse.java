package com.ppkwu.task1;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pawel.welfle
 */
@RestController
public class OurRestResponse {
    /**
     * to test the method we must hit to the endpoint --->  http://localhost:8080/reverse?testedWord=testowanyString
     */
    @GetMapping("/reverse")
    @ResponseBody
    public String revString(@RequestParam String testedWord) {
        StringBuilder stringBuilder = new StringBuilder(testedWord).reverse();
        testedWord = stringBuilder.toString();
        return testedWord;
    }
}
