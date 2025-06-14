package org.kpg.themisapi.controller;

import org.kpg.themisapi.model.CreateRequest;
import org.kpg.themisapi.service.OrderCreateContext;
import org.kpg.themisapi.strategies.a.TypeAOrderCreateStrategy;
import org.kpg.themisapi.strategies.b.TypeBOrderCreateStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThemisController {

    @Autowired
    private TypeAOrderCreateStrategy aOrderCreateStrategy;

    @Autowired
    private TypeBOrderCreateStrategy bOrderCreateStrategy;

    @Autowired
    private OrderCreateContext orderCreateContext;

    @GetMapping("/create")
    public ResponseEntity<String> createEntry(@RequestBody CreateRequest request){
        String response;
        // route the traffic to the correct strategy
        switch(request.getType()) {
            case "A":
                orderCreateContext.setCreateStrategy(aOrderCreateStrategy);
                break;
            case "B":
                orderCreateContext.setCreateStrategy(bOrderCreateStrategy);
                break;
            default:
                return new ResponseEntity<>("order type not implemented", HttpStatus.NOT_IMPLEMENTED);
        }

        response = orderCreateContext.executeStrategy(request.getChannel());

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
