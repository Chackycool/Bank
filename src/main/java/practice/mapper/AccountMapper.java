package practice.mapper;

import org.springframework.web.bind.annotation.RequestMapping;
import practice.dto.AccountRequestDto;
import practice.dto.AccountResponseDto;
import practice.entity.AccountEntity;


public class AccountMapper {

    public AccountEntity accountRequestDtoToAccountEntity(AccountRequestDto accountRequestDto)
    {
        AccountEntity accountEntity = new AccountEntity();
        if (accountRequestDto == null)
        {
            throw new RuntimeException("AccountEntity is null");
        }
        accountEntity.setId(accountRequestDto.getId());
        accountEntity.setName(accountRequestDto.getName());
        accountEntity.setBank_id(accountRequestDto.getBank_id());
        return accountEntity;
    }
    public AccountResponseDto AccountEntityToAccountResponseDto(AccountEntity accountEntity)
    {
        AccountResponseDto accountResponseDto = new AccountResponseDto();
        if (accountResponseDto == null)
        {
            throw new RuntimeException("BankEntity is null");
        }
        accountResponseDto.setId(accountEntity.getId());
        accountResponseDto.setName(accountEntity.getName());
        accountResponseDto.setBank_id(accountEntity.getBank_id());
        return accountResponseDto;
    }
}
