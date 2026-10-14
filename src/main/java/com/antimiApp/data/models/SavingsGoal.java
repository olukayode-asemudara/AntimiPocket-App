package com.antimiApp.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Document(collection = "savings_goals")
public class SavingsGoal {

    @Id
    private String id;

    private String teenProfileId;
    private String title;
    private BigDecimal targetAmount;
    private BigDecimal savedAmount = BigDecimal.ZERO;
    private Date targetDate;
    private GoalStatus status = GoalStatus.IN_PROGRESS;
    private Date createdAt = new Date();
}

