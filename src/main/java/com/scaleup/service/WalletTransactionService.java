package com.scaleup.service;

import com.scaleup.domain.WalletTransactionType;
import com.scaleup.model.Wallet;
import com.scaleup.model.WalletTransaction;

import java.util.List;

public interface WalletTransactionService {
    WalletTransaction createTransaction(Wallet wallet,
                                        WalletTransactionType type,
                                        String transferId,
                                        String purpose,
                                        Long amount
    );

    List<WalletTransaction> getTransactions(Wallet wallet, WalletTransactionType type);

}
