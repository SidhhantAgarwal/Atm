package com.assignment.transaction;

import com.assignment.core.User;

public interface ITransactionHandler {

    public void validate();

    public void completeTransaction(User user);

}
