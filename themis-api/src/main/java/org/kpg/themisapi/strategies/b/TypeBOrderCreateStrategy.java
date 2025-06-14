package org.kpg.themisapi.strategies.sto;

import lombok.extern.slf4j.Slf4j;
import org.kpg.themisapi.strategies.OrderCreateStrategy;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TypeBOrderCreateStrategy implements OrderCreateStrategy {
    @Override
    public String execute(String channel) {
        log.info("Creating STO for channel {}", channel);
        return "Creating STO for channel " + channel;
    }
}
