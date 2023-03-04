package sn.esmt.cv.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class AppCvEntity {
    private Integer id;
    private String first_name;
    private String last_name;
    private Integer age;
    private String address;
    private String email;
    private Specialite specialite;
    private NiveauEtude niveauEtude;
    private String exp_pro;
}
