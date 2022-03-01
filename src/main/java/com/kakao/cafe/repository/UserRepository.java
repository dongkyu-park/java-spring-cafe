package com.kakao.cafe.repository;

import com.kakao.cafe.domain.UserInformation;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

    void savaUserInformation(UserInformation userInformation);
    Optional<UserInformation> findUserInformationById(String userId);
    List<UserInformation> findAllUserInformation();
}
