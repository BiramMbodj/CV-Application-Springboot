package sn.esmt.cv.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="cv")
public class AppCvEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 150, nullable = false)
    private String first_name;
    @Column(length = 100, nullable = false)
    private String last_name;
    @Column(name = "age")
    private Integer age;
    @Column(length = 200, nullable = false)
    private String address;
    @Column(length = 200, nullable = false)
    private String email;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    @Enumerated(EnumType.STRING)
    private NiveauEtude niveauEtude;
    @Column(length = 1000, nullable = false)
    private String exp_pro;
}
