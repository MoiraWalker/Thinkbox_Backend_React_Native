package nl.thinkbox.demo.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Project {

//    public Object saveProject;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "private_view")
    private Boolean privateView;


    public Project() {
    }

    public Project(Long id, String title, Boolean privateView) {
        this.id = id;
        this.title = title;
        this.privateView = privateView;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getPrivateView() {
        return privateView;
    }

    public void setPrivateView(Boolean privateView) {
        this.privateView = privateView;
    }

}
