package com.rapidpay.leco.service.custom.impl;

import java.util.List;
import java.util.Optional;

import com.rapidpay.leco.model.LecoUser;
import com.rapidpay.leco.repo.custom.LecoUserRepo;
import com.rapidpay.leco.service.custom.LecoUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LecoUserServiceImpl implements LecoUserService {

    @Autowired
    private LecoUserRepo lecoUserRepo;

    @Override
    public List<LecoUser> getAllLecoUsers() throws Exception {
        return lecoUserRepo.findAll();
    }

    @Override
    public Optional<LecoUser> getLecoUser(int id) throws Exception {
        return lecoUserRepo.findById(id);
    }

    @Override
    public boolean checkLecoUser(String account_number) throws Exception {
        List<LecoUser> lecoUsers = lecoUserRepo.findAll();

        for (LecoUser lecoUser: lecoUsers){
            if(lecoUser.getAccount_number().equals(account_number)){
                return true;
            }
        }
        
        return false;
    }

    @Override
    public LecoUser saveLecoUser(LecoUser lecoUser) throws Exception {
        return lecoUserRepo.save(lecoUser);
    }

    @Override
    public LecoUser updateLecoUser(LecoUser lecoUser) throws Exception {
        if(!lecoUserRepo.findById(lecoUser.getId()).isEmpty()){
            return lecoUserRepo.save(lecoUser);
        }else{
            return null;
        }
    }

    @Override
    public void deleteLecoUser(int id) throws Exception {
        lecoUserRepo.deleteById(id);
    }

}
