package mk.ukim.finki.audwp.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Category {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        @Column(length = 4000)
        private String descrption;

        public Category(String name, String descrption) {
            this.name = name;
            this.descrption = descrption;
        }

    public Category() {
    }
}
