package com.fit_us.web.user.presentation.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserResponse {
    private String provider;
    private String name;
    private String nickname;
    private String email;
    private ProfileInfo profile;

    @Getter
    @AllArgsConstructor
    public static class ProfileInfo {
        private String profileImageUrl;
        private String birthDate; // "yyyy-MM-dd" 형식의 문자열
        private String gender;
        private String bloodType;
    }
}