package pl.wkur3k.Zadanie.xCode.service;

import org.springframework.stereotype.Service;

@Service
public class StatusServiceImpl implements StatusService {
    @Override
    public String pong(){
        return "pong";
    }
}
