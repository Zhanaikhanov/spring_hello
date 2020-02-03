package kz.beka.beka.test.service;
import kz.beka.beka.test.domain.DemoModel;
import kz.beka.beka.test.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class DemoServiceImpl implements DemoService{
    @Autowired
    private DemoMapper demoMapper;
    public String getModel(){
        return demoMapper.getOne();
    }
}
