package request;

import enums.Genre;
import enums.Language;
import lombok.Data;

import java.sql.Date;

@Data
public class MovieRequest {
    private String movieName;
    private Integer duration;
    private Double rating;
    private Date releaseDate;
    private Genre genre;
    private Language language;
}
