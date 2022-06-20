package practice.service;
import practice.dto.AccountRequestDto;
import practice.dto.AccountResponseDto;

import java.util.List;

public interface AccountService {
    void createAccount(AccountRequestDto accountRequestDto);

    List<AccountResponseDto> getAllAccounts();

    AccountResponseDto getById(int id);


    void deleteById(int id);

}
