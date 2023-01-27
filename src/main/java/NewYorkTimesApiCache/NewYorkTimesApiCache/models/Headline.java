package NewYorkTimesApiCache.NewYorkTimesApiCache.models;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Headline implements Serializable {

    private static final long serialVersionUID = -4984490827017336778L;

    String main;

    @JsonProperty("print_headline")
    String printHeadline;
}
