package com.zerobase.foodlier.global.profile.dto;

import com.zerobase.foodlier.module.member.member.domain.vo.Address;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberPrivateProfileForm {
    private String nickName;
    private String phoneNumber;
    private Address address;
}
