package undertow;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lombok.Data;

@Repository
public interface HelloRepository extends JpaRepository<Hello, Long> {

}

@Entity
@Data
class Hello implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    Long id;
    String name;
}