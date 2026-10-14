package com.antimiApp.data.repositories;

import com.antimiApp.data.models.FinancialDiaryEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FinancialDiaryEntryRepository extends MongoRepository<FinancialDiaryEntry, String> {

    List<FinancialDiaryEntry> findByTeenProfileId(String teenProfileId);

    List<FinancialDiaryEntry> findByTransactionId(String transactionId);
}
