package com.rapidpay.leco.service.custom;

import java.util.List;
import java.util.Optional;
import com.rapidpay.leco.model.LecoUser;
import com.rapidpay.leco.service.SuperService;
import org.springframework.stereotype.Service;

@Service
public interface LecoUserService extends SuperService {
    public List<LecoUser> getAllLecoUsers() throws Exception;

    public Optional<LecoUser> getLecoUser(int id) throws Exception;

    public boolean checkLecoUser(String account_number) throws Exception;

    public LecoUser saveLecoUser(LecoUser lecoUser) throws Exception;

    public LecoUser updateLecoUser(LecoUser lecoUser) throws Exception;

    public void deleteLecoUser(int id) throws Exception;
}
