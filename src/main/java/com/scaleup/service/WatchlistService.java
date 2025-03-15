package com.scaleup.service;

import com.scaleup.model.Coin;
import com.scaleup.model.User;
import com.scaleup.model.Watchlist;

public interface WatchlistService {

    Watchlist findUserWatchlist(Long userId) throws Exception;

    Watchlist createWatchList(User user);

    Watchlist findById(Long id) throws Exception;

    Coin addItemToWatchlist(Coin coin,User user) throws Exception;
}
