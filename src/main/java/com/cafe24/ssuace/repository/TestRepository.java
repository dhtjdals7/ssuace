package com.cafe24.ssuace.repository;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestRepository
{
    String getMember();

    void updateMember();
}