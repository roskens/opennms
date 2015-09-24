package org.opennms.core.test.xml;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;
import org.json.JSONException;
import org.junit.Assert;
import org.skyscreamer.jsonassert.JSONAssert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;


public final class JsonTest {

    private static final Logger LOG = LoggerFactory.getLogger(JsonTest.class);

    private static final ObjectMapper DEFAULT_OBJECT_MAPPER = new ObjectMapper();

    static {
        final JaxbAnnotationModule module = new JaxbAnnotationModule();
        DEFAULT_OBJECT_MAPPER.registerModule(module);
    }

    private JsonTest(){}

    public static <T> String marshalToJson(T object) throws IOException {
        LOG.debug("Reference Object: {}", object);
        String json = DEFAULT_OBJECT_MAPPER.writerWithDefaultPrettyPrinter().writeValueAsString(object);
        LOG.debug("JSON: {}", json);
        return json;
    }

    public static void assertJsonEquals(String expected, String actual) {
        try {
            JSONAssert.assertEquals(expected, actual, true);
        } catch (JSONException ex) {
            Assert.fail(ex.getMessage());
        }
    }
}
