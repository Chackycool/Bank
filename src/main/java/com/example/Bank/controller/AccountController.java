package com.example.Bank.controller;

import org.springframework.stereotype.Controller;
import practice.dto.AccountRequestDto;
import practice.dto.AccountResponseDto;
import practice.service.AccountServiceImpl;

import java.util.List;

@Controller
public class AccountController {
    private final AccountServiceImpl accountServiceImpl = new AccountServiceImpl();

    public void create(AccountRequestDto accountRequestDto) {
        accountServiceImpl.createAccount(accountRequestDto);
    }

    public List<AccountResponseDto> getAllAccounts() {
        return accountServiceImpl.getAllAccounts();
    }

    public AccountResponseDto getAccountById(int id) {
        return accountServiceImpl.getById(id);
    }

    public void deleteAccountById(int id) {
        accountServiceImpl.deleteById(id);
    }
}
