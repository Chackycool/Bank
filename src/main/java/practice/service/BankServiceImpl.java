package practice.service;

import practice.dto.BankRequestDto;
import practice.dto.BankResponseDto;
import practice.mapper.BankMapper;
import practice.repository.BankRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BankServiceImpl implements BankService {
    private final BankRepositoryImpl bankRepositoryImpl = new BankRepositoryImpl();

    private final BankMapper bankMapper = new BankMapper();

    @Override
    public void createBank(BankRequestDto bankRequestDto) {
        //TODO add check unique object
        if (unicCheck(bankRequestDto.getId())) {
            bankRepositoryImpl.add(bankMapper.bankRequestDtoToBankEntity(bankRequestDto));
        }
    }

    public boolean unicCheck(int id) {
        for (var i : getAllBanks()) {
            if (i.getId() == id) {
                System.out.println("Error");
                return false;
            }
        }
        return true;
    }

    @Override
    public List<BankResponseDto> getAllBanks() {
        return bankRepositoryImpl.getAllBanks()
                .stream()
                .map(bankMapper::bankEntityToBankResponseDto)
                .toList();
    }

    @Override
    public BankResponseDto getById(int id) {
        BankResponseDto bankResponseDto1 = new BankResponseDto();
        for (var i : getAllBanks()
        ) {
            if (i.getId() == id) bankResponseDto1 = i;
        }
        return bankResponseDto1;
    }

    @Override
    public void deleteById(int id) {
        bankRepositoryImpl.deleteById(id);
    }
}