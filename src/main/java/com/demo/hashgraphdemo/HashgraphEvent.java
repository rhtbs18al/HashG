package com.demo.hashgraphdemo;

import java.util.List;


public interface HashgraphEvent {
    String getSelfParentHash();
    String getOtherParentHash();
    List<HashgraphTransaction> getTransactions();
}
