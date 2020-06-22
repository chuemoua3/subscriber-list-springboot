package com.win.subscriber.subscriber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// designates this class as a controller
@Controller
public class SubscriberController {

    @Autowired
    private SubscriberRepository subscriberRepository;

    // tells our application what template to return at a specific url
    @GetMapping
    public String index(Subscriber subscriber) {
        return "subscriber/index";
    }

    private Subscriber subscriber;

    // takes the data entered in the form and adds it to the database.
    // POSTs the data then display a new template called "result"
    public String addNewSubscriber(Subscriber subscriber, Model model) {
        subscriberRepository.save(new Subscriber(subscriber.getFirstName(), subscriber.getLastName(),
                subscriber.getUserName(), subscriber.getSignedUp()));
        model.addAttribute("firstName", subscriber.getFirstName());
        model.addAttribute("lastName", subscriber.getLastName());
        model.addAttribute("userName", subscriber.getUserName());
        return "subscriber/result";


    }
}