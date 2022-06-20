package com.example.Bank.controller;
import com.sun.source.util.SourcePositions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import practice.dto.BankRequestDto;
import practice.dto.BankResponseDto;
import practice.service.BankService;
import practice.service.BankServiceImpl;
import org.springframework.stereotype.Controller;
import practice.service.BankServiceImpl;

import javax.validation.Valid;
import java.util.List;

@RestController
public class BankController
{


    private final BankService bankService = new BankServiceImpl();

        @PostMapping("/create")
        public void create (@RequestBody @Valid BankRequestDto bankRequestDto)
        {
            bankService.createBank(bankRequestDto);
        }

    @GetMapping("/getBanks")
    public List<BankResponseDto> getAllBanks()
    {
        return bankService.getAllBanks();
    }
    @GetMapping("/getBankById")
    public BankResponseDto getBankById(int id)
    {
        return bankService.getById(id);
    }
    @DeleteMapping("/deleteBank")
    public void deleteBankById(int id){
        bankService.deleteById(id);
    }
}
