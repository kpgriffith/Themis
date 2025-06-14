package org.kpg.themisapi.strategies.po;

import lombok.extern.slf4j.Slf4j;
import org.kpg.themisapi.strategies.OrderCreateStrategy;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TypeAOrderCreateStrategy implements OrderCreateStrategy {
    @Override
    public String execute(String channel) {
        log.info("Creating PO for channel {}", channel);
        return "Creating PO for channel " + channel;
    }
}
