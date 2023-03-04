package sn.esmt.cv.ws;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sn.esmt.cv.dao.AppCvRepository;
import sn.esmt.cv.entities.AppCvEntity;

import java.util.List;

@RestController
@RequestMapping(path="/cv")
@AllArgsConstructor
public class AppCvController {
    private AppCvRepository appCvRepository;

    @PostMapping(path = "/save")
    public AppCvEntity save(@RequestBody AppCvEntity appCvEntity){
        return appCvRepository.save(appCvEntity);
    }

    @GetMapping(path = "/all")
    public List<AppCvEntity> getAll(){
        return appCvRepository.findAll();
    }
}
