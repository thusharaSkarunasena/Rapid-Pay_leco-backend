package com.rapidpay.leco.repo.custom;

import com.rapidpay.leco.model.LecoUser;
import com.rapidpay.leco.repo.CrudRepo;
import org.springframework.stereotype.Repository;

@Repository
public interface LecoUserRepo extends CrudRepo<LecoUser, Integer> {

}