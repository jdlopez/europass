package es.jdl.europass.service.exception;

/**
 *
 * @author jdlopez
 */
public class NotFoundRestException extends Throwable {

    private final String entity;
    private final String[] params;

    public NotFoundRestException(String entity, String... params) {
        super();
        this.entity = entity;
        this.params = params;
    }
}
