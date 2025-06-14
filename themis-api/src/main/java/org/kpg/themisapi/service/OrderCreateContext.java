package org.kpg.themisapi.service;

import lombok.Setter;
import org.kpg.themisapi.model.OrderRequest;
import org.kpg.themisapi.strategies.OrderCreateStrategy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.Serial;

@Setter
@Service
public class OrderCreateContext {

    private OrderCreateStrategy createStrategy;

    public String executeStrategy(OrderRequest or){
        return createStrategy.execute(or);
    }

}
