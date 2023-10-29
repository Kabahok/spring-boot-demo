package ru.egoravdeev.springBootDemo.service;

public class ProductionProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is production";
    }
}
