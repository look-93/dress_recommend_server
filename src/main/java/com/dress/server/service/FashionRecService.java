package com.dress.server.service;

import java.util.List;

public interface FashionRecService {
    List<String> getWomanClothes(int tob,int bottom);
    List<String> getManClothes(int tob,int bottom);
}
