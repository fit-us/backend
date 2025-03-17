package com.fit_us.web.user.domain;

public enum BloodType {
    RH_PLUS_A, RH_MINUS_A,
    RH_PLUS_B, RH_MINUS_B,
    RH_PLUS_AB, RH_MINUS_AB,
    RH_PLUS_O, RH_MINUS_O;

    public static BloodType parse(String bloodType){
        return BloodType.valueOf(bloodType.toUpperCase());
    }
}
