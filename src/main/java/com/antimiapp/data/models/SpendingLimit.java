package com.antimiapp.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Document(collection = "spending_limits")
public class SpendingLimit {

    @Id
    private String id;

    private String teenProfileId;
    private BigDecimal limitAmount;
    private SpendingPeriod period;
    private Date createdAt = new Date();
}

