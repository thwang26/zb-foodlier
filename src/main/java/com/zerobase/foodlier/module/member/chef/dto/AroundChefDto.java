package com.zerobase.foodlier.module.member.chef.dto;

public interface AroundChefDto {

    //chefMember
    Long getChefId();
    String getIntroduce();
    double getStarAvg();
    int getReviewCount();

    //member
    String getProfileUrl();
    String getNickname();
    double getLat();
    double getLnt();

    //etc
    double getDistance();
    int getRecipeCount();

}
