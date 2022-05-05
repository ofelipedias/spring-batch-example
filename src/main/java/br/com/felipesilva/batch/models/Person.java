package br.com.felipesilva.batch.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private Integer age;
    @Column(name = "date_create")
    private LocalDateTime creationDate;

    @PrePersist
    private void dateCreate() {
        this.setCreationDate(LocalDateTime.now());
    }
}
