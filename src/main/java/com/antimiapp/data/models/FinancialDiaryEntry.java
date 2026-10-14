package com.antimiapp.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "financial_diary_entries")
public class FinancialDiaryEntry {

    @Id
    private String id;

    private String teenProfileId;
    private String transactionId;
    private String expenseReason;
    private String reflection;
    private Date createdAt = new Date();
}

