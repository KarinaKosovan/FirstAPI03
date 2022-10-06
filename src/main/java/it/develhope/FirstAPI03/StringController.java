package it.develhope.FirstAPI03;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/strings")
public class StringController {

    @GetMapping
    public String concat(@RequestParam String first, @RequestParam(required = false) String second) {
        if(second == null) {
            second = "";
        }
        return first.concat(" " + second);
    }
}
