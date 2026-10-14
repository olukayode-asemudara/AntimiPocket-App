package com.antimiapp.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Document(collection = "approval_requests")
public class ApprovalRequest {

    @Id
    private String id;

    private String teenProfileId;
    private String guardianProfileId;
    private String transactionId;
    private BigDecimal amount;
    private String reason;
    private ApprovalStatus status = ApprovalStatus.PENDING;
    private Date requestedAt = new Date();
    private Date reviewedAt;
}
