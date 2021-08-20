package com.kg.database;

import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Integer> {

	Account findByName(String name);
}
