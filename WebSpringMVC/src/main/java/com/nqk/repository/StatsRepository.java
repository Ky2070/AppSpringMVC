/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.nqk.repository;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Kiet
 */
public interface StatsRepository {
    public List<Object[]> countProductByCate();
    public List<Object[]> statsRevenue(Map<String, String> params);
}
