package Hondana.Hondana.Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Books")
public class Book {
    @Id
    private long id;
    private String title;
    private String author;

    @Column(name = "number_of_volumes")
    private String num_of_vol;

    @Column(name = "destination_group_id")
    private int destination_group;

    @Column(name = "genre_id")
    private int genre;

}
