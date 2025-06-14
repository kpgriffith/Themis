package org.kpg.themisapi.service;

import lombok.Setter;
import org.kpg.themisapi.strategies.OrderCreateStrategy;
import org.springframework.stereotype.Service;

@Setter
@Service
public class OrderCreateContext {

    private OrderCreateStrategy createStrategy;

    public String executeStrategy(String channel){
        return createStrategy.execute(channel);
    }

}
