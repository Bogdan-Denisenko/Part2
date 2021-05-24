package com.example.service3;

import java.util.ArrayList;

public class CommonStatistics {
    private final Statistics statistics;
    private final ArrayList<ServiceInfo> serviceInfoArrayList;

    CommonStatistics(Statistics statistics, ArrayList<ServiceInfo> serviceInfoArrayList)
    {
        this.statistics = statistics;
        this.serviceInfoArrayList = serviceInfoArrayList;
    }

    public Statistics getStatistics()
    {
        return statistics;
    }

    public ArrayList<ServiceInfo> getServiceInfoArrayList()
    {
        return serviceInfoArrayList;
    }
}
