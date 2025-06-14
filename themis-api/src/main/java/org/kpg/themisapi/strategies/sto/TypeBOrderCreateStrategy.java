package org.kpg.themisapi.strategies.sto;

import lombok.extern.slf4j.Slf4j;
import org.kpg.themisapi.model.OrderRequest;
import org.kpg.themisapi.strategies.OrderCreateStrategy;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TypeBOrderCreateStrategy implements OrderCreateStrategy {
    @Override
    public String execute(OrderRequest or) {
        log.info("Creating STO for channel {}", or.getChannel());
        return "Creating STO for channel " + or.getChannel();
    }
}
