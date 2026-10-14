package com.antimiApp.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Document(collection = "transactions")
public class Transaction {

    @Id
    private String id;

    private String pocketId;
    private BigDecimal amount;
    private TransactionType type;
    private String description;
    private TransactionStatus status;
    private Date createdAt = new Date();
}

