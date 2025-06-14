package org.kpg.themisapi.strategies.po;

import lombok.extern.slf4j.Slf4j;
import org.kpg.themisapi.model.OrderRequest;
import org.kpg.themisapi.strategies.OrderCreateStrategy;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TypeAOrderCreateStrategy implements OrderCreateStrategy {
    @Override
    public String execute(OrderRequest or) {
        log.info("Creating PO for channel {}", or.getChannel());
        return "Creating PO for channel " + or.getChannel();
    }
}
