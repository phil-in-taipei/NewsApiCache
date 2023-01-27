package NewYorkTimesApiCache.NewYorkTimesApiCache.models;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.io.Serializable;


import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Byline implements Serializable{

    private static final long serialVersionUID = 3484347670665746434L;


    String original;

    // person object here (not going to include)

    String organization;
}
