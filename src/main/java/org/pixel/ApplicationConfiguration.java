package org.pixel;


import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.pixel.model.NNPlace;
import org.pixel.model.NNPlaceApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ApplicationConfiguration {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        mapper.typeMap(NNPlaceApi.class, NNPlace.class).addMappings(mapping -> {
            mapping.map(NNPlaceApi::getLatitude, NNPlace::setLatitudeFromString);
            mapping.map(NNPlaceApi::getLongitude, NNPlace::setLongitudeFromString);
        });


        return mapper;
    }


}
