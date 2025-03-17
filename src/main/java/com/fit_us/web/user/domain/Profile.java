package com.fit_us.web.user.domain;

import com.fit_us.web.common.entity.BaseEntity;
import com.fit_us.web.common.utility.DateUtils;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

import java.time.LocalDate;

@Entity(name = "profile")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Builder(access = AccessLevel.PROTECTED)
public class Profile extends BaseEntity {
    @Column(nullable = false)
    private String profileImageUrl;

    @Column(nullable = false)
    private LocalDate birthDate;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private BloodType bloodType;

    public static Profile create(String profileImageUrl, String birthDate, String gender, String bloodType) {
        LocalDate parsedBirthDate = DateUtils.parseDate(birthDate);
        Gender parsedGender = Gender.parse(gender);
        BloodType parsedBloodType = BloodType.parse(bloodType);

        return builder()
                .profileImageUrl(profileImageUrl)
                .birthDate(parsedBirthDate)
                .gender(parsedGender)
                .bloodType(parsedBloodType)
                .build();
    }
    /**
     * 생년월일
     * 성별
     * 혈액형
     * 프로필 사진
     * 감정기록 설정
     * 약 복용 유무
     * 정병 자가문진 했
     */

}
