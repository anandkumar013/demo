package com.example.demo.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Setter @Getter
@RequiredArgsConstructor
@ToString
@NoArgsConstructor
public class Comment   extends  Auditable {

    @Id
    @GeneratedValue
    private  long id;

    @NonNull
    private  String body ;

    //link
    @ManyToOne
    @NonNull
    private Link  link;

}
