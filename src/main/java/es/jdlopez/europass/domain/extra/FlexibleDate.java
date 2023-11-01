package es.jdlopez.europass.domain.extra;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Data;

import java.time.LocalDate;

/**
 * Similar to the standard date type, but each section after the year is optional. e.g. 2014-06-29 or 2023-04
 * json schema definition?
 *     "iso8601": {
 *       "type": "string",
 *       "description": "Similar to the standard date type, but each section after the year is optional. e.g. 2014-06-29 or 2023-04",
 *       "pattern": "^([1-2][0-9]{3}-[0-1][0-9]-[0-3][0-9]|[1-2][0-9]{3}-[0-1][0-9]|[1-2][0-9]{3})$"
 *     }
 */
@Data
public class FlexibleDate {
    @JsonValue
    private String value;
    @JsonIgnore
    public LocalDate getDate() {
        return null;
    }

    @JsonIgnore
    public int getYear() {
        return 0;
    }

    @JsonIgnore
    public int getMonth() {
        return 0;
    }
    @JsonIgnore
    public int getDay() {
        return 0;
    }
}
