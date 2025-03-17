package com.fit_us.web.user.application.dto;

import com.fit_us.web.user.domain.Profile;
import com.fit_us.web.user.domain.User;
import com.fit_us.web.user.presentation.dto.UserResponse;

import java.time.format.DateTimeFormatter;

public class UserDtoMapper {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    /**
     * 도메인 User 객체를 UserResponse DTO로 변환
     */
    public static UserResponse toResponse(User user) {
        if (user == null) {
            throw new IllegalArgumentException("User cannot be null.");
        }

        UserResponse.ProfileInfo profileInfo = null;
        Profile profile = user.getProfile();
        if (profile != null) {
            profileInfo = new UserResponse.ProfileInfo(
                    profile.getProfileImageUrl(),
                    profile.getBirthDate().format(DATE_FORMATTER),
                    profile.getGender().name(),
                    profile.getBloodType().name()
            );
        }

        return new UserResponse(
                user.getProvider(),
                user.getName(),
                user.getNickname(),
                user.getEmail(),
                profileInfo
        );
    }
}

