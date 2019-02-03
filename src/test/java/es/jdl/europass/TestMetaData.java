package es.jdl.europass;

import org.junit.Test;

import java.util.Arrays;
import java.util.Locale;

public class TestMetaData {

    @Test
    public void listLang() {
        System.out.println("Locale.getISOLanguages=" + Arrays.toString(Locale.getISOLanguages()));
        Locale loc = Locale.getDefault();
        System.out.println("Language " + loc.getLanguage() + " DisplayLanguage " + loc.getDisplayLanguage());
    }

    @Test
    public void listCountry() {

        System.out.println("Locale.getISOCountries=" + Arrays.toString(Locale.getISOCountries()));
        Locale loc = Locale.getDefault();
        System.out.println("DisplayCountry " + loc.getDisplayCountry());
    }
}
