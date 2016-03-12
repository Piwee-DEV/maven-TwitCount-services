package net.piwee.twitcount.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by alexandrenguyen on 12/03/16.
 */

@RestController
public class HelloController {

    @RequestMapping
    public String index() {
        return "Greetings !";
    }
}
