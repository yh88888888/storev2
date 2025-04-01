package com.metacoding.storev2.order;

import jakarta.persistence.Column;
import lombok.Data;
@Data
public class OrderRequest {
@Data
    public static class LogDTO {
        private Integer userId;
        private Integer storeId;
        private int qty;
    }

}
