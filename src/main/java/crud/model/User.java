package crud.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


import java.util.Date;


@Entity
@Table (name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    @NotEmpty(message = "Name field cannot be empty")
    @Size(min = 2, max = 30, message = "Name field must be between 2 and 30 characters")
    private String name;

    @Column
    @Email(message = "Enter valid email like mail@mail.com", regexp = ".+@.+\\..+")
    @Size(min = 5, max = 30, message = "Name field must be between 2 and 30 characters")
    private String mail;

    @CreationTimestamp
    @Column(updatable = false)
    private Date creationDate;

    @UpdateTimestamp
    private Date lastModify;

    public User() {
    }

    public User(String name, String mail, Date creationDate, Date lastModify) {
        this.name = name;
        this.mail = mail;
        this.creationDate = creationDate;
        this.lastModify = lastModify;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastModify() { return lastModify; }

    public void setLastModify(Date lastModify) { this.lastModify = lastModify; }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", creationDate=" + creationDate + '\'' +
                ", lastModify=" + lastModify +
                '}';
    }
}