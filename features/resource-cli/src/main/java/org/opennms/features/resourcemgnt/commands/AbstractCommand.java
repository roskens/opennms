package org.opennms.features.resourcemgnt.commands;

import com.fasterxml.jackson.jaxrs.annotation.JacksonFeatures;
import com.google.common.base.Strings;
import com.google.common.net.UrlEscapers;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import org.opennms.features.resourcemgnt.ResourceCli;

import javax.ws.rs.client.WebTarget;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;

public abstract class AbstractCommand implements Command {

    protected WebTarget connect(final ResourceCli resourceCli, final String resource) {
        // Initialize the REST client
        ClientConfig clientConfig = new ClientConfig();
        HttpAuthenticationFeature feature = HttpAuthenticationFeature.universal(resourceCli.getUsername(), resourceCli.getPassword());
        clientConfig.register(feature);
        clientConfig.register(JacksonFeatures.class);
        Client client = ClientBuilder.newClient(clientConfig);

        // Build the request URL
        final StringBuilder url = new StringBuilder();
        url.append(resourceCli.getBaseUrl());
        url.append("/rest/resources");
        if (! Strings.isNullOrEmpty(resource)) {
            url.append("/");
            url.append(UrlEscapers.urlPathSegmentEscaper().escape(resource));
        }

        // Build the web resource
        return client
                .target(url.toString());
    }

    protected WebTarget connect(final ResourceCli resourceCli) {
        return this.connect(resourceCli, null);
    }
}
