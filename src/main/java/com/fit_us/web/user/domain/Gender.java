package com.fit_us.web.user.domain;

public enum Gender {
    MALE, FEMALE;
    public static Gender parse(String gender){
        return Gender.valueOf(gender.toUpperCase());
    }
}
