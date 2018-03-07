package me.abebe.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Controller
public class MainController {
    @RequestMapping("/")
    public @ResponseBody String showIndex(){
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);

        //String xx= quote.getValue().getQuote();
        //model.addAttribute("quote", xx);
        //return quote.getValue().getQuote();
        return quote.getValue().getQuote();
    }
}
