package com.example.demo.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@RequiredArgsConstructor
@ToString@NoArgsConstructor
public class Link extends  Auditable{

    @Id
    @GeneratedValue
    private  long id;
    @NonNull
    private  String title ;
    @NonNull
    private String url ;

    //comments

    @OneToMany(mappedBy = "link")
    private List<Comment> comments = new ArrayList<>();

    public void AddComment(Comment comment){
        comments.add(comment);
    }
}
