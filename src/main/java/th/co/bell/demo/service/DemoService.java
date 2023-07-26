package th.co.bell.demo.service;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import th.co.bell.demo.entity.DemoEntity;
import th.co.bell.demo.repository.DemoRepository;
import th.co.bell.demo.request.DemoRequest;

@Service
public class DemoService {

    @Setter(onMethod_ = @Autowired)
    private DemoRepository demoRepository;

    @Transactional
    public boolean createNewUser(DemoRequest demoRequest) {
        try {
            demoRepository.save(DemoEntity.builder()
                    .username(demoRequest.getUsername())
                    .password(demoRequest.getPassword())
                    .email(demoRequest.getEmail()).build());
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
