package practice.repository;

import practice.entity.BankEntity;

import java.util.List;
public interface BankRepository
{
    void add(BankEntity bankEntity);
    List<BankEntity> getAllBanks();
    public BankEntity getBankById(int id);
    void deleteById(int id);
}
