package kebabs;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Date;
import java.util.List;

@Data
public class Kebab {
    private Long id;
    private Date createdAt;
    @NotNull
    @Size(min = 5, message = "Nazwa musi składać się z przynajmniej 5 znaków.")
    private String name;
    @Size(min = 1, message = "Musisz wybrać przynajmniej 1 składnik.")
    private List<String> ingredients;
}