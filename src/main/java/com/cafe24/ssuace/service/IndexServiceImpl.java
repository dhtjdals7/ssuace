package com.cafe24.ssuace.service;

import com.cafe24.ssuace.repository.TestRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class IndexServiceImpl implements IndexService
{
    private final TestRepository testRepository;

    @Override
    public String getMember()
    {
        return testRepository.getMember();
    }

    @Override
    public void updateMember()
    {
        testRepository.updateMember();
    }
}