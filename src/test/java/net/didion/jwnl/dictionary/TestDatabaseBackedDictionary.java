package net.didion.jwnl.dictionary;

import net.didion.jwnl.JWNLException;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Creates a DatabaseBackedDictionary and creates all the test cases.
 *
 * @author Aliaksandr Autayeu avtaev@gmail.com
 */
public class TestDatabaseBackedDictionary extends DictionaryTester {

    /**
     * Properties location.
     */
    protected String properties = "./config/database_properties.xml";

    public void initDictionary() throws IOException, JWNLException {
        dictionary = Dictionary.getInstance(new FileInputStream(properties));
    }
}