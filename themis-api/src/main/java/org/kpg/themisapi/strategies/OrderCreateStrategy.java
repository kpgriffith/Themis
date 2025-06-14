package org.kpg.themisapi.strategies;

import org.kpg.themisapi.model.OrderRequest;

public interface OrderCreateStrategy {
    String execute(OrderRequest or);
}
