package NewYorkTimesApiCache.NewYorkTimesApiCache.models;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Multimedia implements Serializable {

    private static final long serialVersionUID = 1923024807214129442L;

    int rank;
    String subtype;
    String caption;
    String credit;
    String type;
    String url;
    int height;
    int width;

    String subType;
}
