package com.fit_us.web.user.application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class CreateUserCommand {
    String name;
    String nickname;
    String oauthId;
    String provider;
    String email;
    ProfileInfo profile;
    @Getter
    @AllArgsConstructor
    @RequiredArgsConstructor
    public static class ProfileInfo {
        private String profileImageUrl;
        private String birthDate;
        private String gender;
        private String bloodType;
    }
}
