package org.kpg.themisapi.model;

import lombok.Data;

@Data
public class OrderRequest {
    private Integer orderNbr;
    private String channel;
}
