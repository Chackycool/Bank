package practice.service;

import practice.dto.BankRequestDto;
import practice.dto.BankResponseDto;

import java.util.List;

public interface BankService
{
    void createBank(BankRequestDto bankRequestDto);

    List<BankResponseDto> getAllBanks();

    BankResponseDto getById(int id);

    void deleteById(int id);
}
