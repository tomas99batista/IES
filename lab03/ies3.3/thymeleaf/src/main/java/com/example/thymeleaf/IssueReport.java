package com.example.thymeleaf;

import javax.persistence.*;
import java.sql.Date;

// The @Entity annotation tells our JPA provider Hibernate that this class should be mapped to the database.
@Entity
// Set the database table name with the @Table(name = "issues") annotation.
@Table(name = "issues")
public class IssueReport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String email;
    private String url;
    private String description;
    private boolean markedAsPrivate;
    private boolean updates;
    private boolean done;
    private Date created;
    private Date updated;

    public IssueReport(){

    }

    @Column(name = "email", nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "url", nullable = false)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Column(name = "description", nullable = false)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isMarkedAsPrivate() {
        return markedAsPrivate;
    }

    public void setMarkedAsPrivate(boolean markedAsPrivate) {
        this.markedAsPrivate = markedAsPrivate;
    }

    public boolean isUpdates() {
        return updates;
    }

    public void setUpdates(boolean updates) {
        this.updates = updates;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Column(name = "created", nullable = false)
    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Column(name = "updated", nullable = false)
    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "IssueReport{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", url='" + url + '\'' +
                ", description='" + description + '\'' +
                ", markedAsPrivate=" + markedAsPrivate +
                ", updates=" + updates +
                ", done=" + done +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}
