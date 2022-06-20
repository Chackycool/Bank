package practice.repository;

import practice.entity.AccountEntity;

import java.util.List;

public interface AccountRepository {
    void add(AccountEntity accountEntity);

    List<AccountEntity> getAllAccounts();
    public int getAccountById(int id);
    public void deleteById(int id);

}
