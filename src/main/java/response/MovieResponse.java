package response;

import java.sql.Date;

import enums.Genre;
import enums.Language;

public record MovieResponse(
        Integer id,
        String movieName,
        Integer duration,
        Double rating,
        Date releaseDate,
        Genre genre,
        Language language
) {
}
