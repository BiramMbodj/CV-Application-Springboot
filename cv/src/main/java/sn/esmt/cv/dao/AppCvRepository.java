package sn.esmt.cv.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.esmt.cv.entities.AppCvEntity;

@Repository
public interface AppCvRepository extends JpaRepository<AppCvEntity, Integer> {
    AppCvEntity findById(int id);
}
