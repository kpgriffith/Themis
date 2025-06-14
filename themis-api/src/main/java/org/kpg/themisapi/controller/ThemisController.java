package org.kpg.themisapi.controller;

import org.kpg.themisapi.model.CreateRequest;
import org.kpg.themisapi.service.OrderCreateContext;
import org.kpg.themisapi.strategies.po.TypeAOrderCreateStrategy;
import org.kpg.themisapi.strategies.sto.TypeBOrderCreateStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThemisController {

    @Autowired
    private TypeAOrderCreateStrategy poOrderCreateStrategy;

    @Autowired
    private TypeBOrderCreateStrategy stoOrderCreateStrategy;

    @Autowired
    private OrderCreateContext orderCreateContext;

    @GetMapping("/create")
    public ResponseEntity<String> createEntry(@RequestBody CreateRequest request){
        String response;
        // route the traffic to the correct strategy
        switch(request.getType()) {
            case "A":
                orderCreateContext.setCreateStrategy(poOrderCreateStrategy);
            case "B":
                orderCreateContext.setCreateStrategy(stoOrderCreateStrategy);
            default:
                return new ResponseEntity<>(HttpStatus.OK);
        }



        return new ResponseEntity<>(HttpStatus.OK);
    }

}
