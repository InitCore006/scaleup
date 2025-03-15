package com.scaleup.repository;

import com.scaleup.model.Coin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoinRepository extends JpaRepository<Coin,String> {
}
