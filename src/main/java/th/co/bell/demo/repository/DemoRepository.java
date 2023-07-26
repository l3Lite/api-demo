package th.co.bell.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.co.bell.demo.entity.DemoEntity;

@Repository
public interface DemoRepository extends JpaRepository<DemoEntity, String> {

}
