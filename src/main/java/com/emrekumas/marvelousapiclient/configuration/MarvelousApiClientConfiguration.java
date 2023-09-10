package com.emrekumas.marvelousapiclient.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.support.PropertySourceFactory;

@Configuration
@PropertySource(value = "classpath:otel-application.yaml", factory = PropertySourceFactory.class)
public class MarvelousApiClientConfiguration {
}
