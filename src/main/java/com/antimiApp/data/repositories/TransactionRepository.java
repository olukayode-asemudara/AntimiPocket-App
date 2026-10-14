package com.antimiApp.data.repositories;

import com.antimiApp.data.models.Transaction;
import com.antimiApp.data.models.TransactionStatus;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TransactionRepository extends MongoRepository<Transaction, String> {

    List<Transaction> findByPocketId(String pocketId);

    List<Transaction> findByPocketIdAndStatus(
            String pocketId,
            TransactionStatus status
    );
}
