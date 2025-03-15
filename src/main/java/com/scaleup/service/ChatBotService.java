package com.scaleup.service;

import com.scaleup.model.CoinDTO;
import com.scaleup.response.ApiResponse;

public interface ChatBotService {
    ApiResponse getCoinDetails(String coinName);

    CoinDTO getCoinByName(String coinName);

    String simpleChat(String prompt);
}
