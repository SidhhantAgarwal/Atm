package com.assignment.transaction;

import com.assignment.core.Transaction;
import com.assignment.core.User;

public interface TransactionHandler {

    public void completeTransaction(User user, Transaction transaction);

}
