package com.fit_us.web.user.domain;

import com.fit_us.web.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

/**
 * Oauth 기반으로
 */

@Entity(name="users")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Builder(access = AccessLevel.PROTECTED)
public class User extends BaseEntity {
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false, unique = true)
    private String oauthId;

    /*
       auth 도메인에서 enum으로 검증하기 떄문에 여기서는 String으로 처리해도  됨.
     */
    @Column(nullable = false)
    private String provider;

    @Column(nullable = false, unique = true)
    private String email;

    @OneToOne(fetch = FetchType.EAGER)
    private Profile profile;

    public static User create(String name, String nickname, String oauthId, String provider, String email) {
        return builder()
                .name(name)
                .nickname(nickname)
                .oauthId(oauthId)
                .provider(provider)
                .email(email)
                .build();
    }
    public void addProfile(Profile profile) {
        if (this.profile != null) {
            throw new IllegalStateException("Profile already exists for this user.");
        }
        this.profile = profile;
    }
}
