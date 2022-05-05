package br.com.felipesilva.batch.batchprocessing;

import br.com.felipesilva.batch.dtos.PersonDto;
import br.com.felipesilva.batch.models.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;

@Slf4j
public class PersonItemProcessor implements ItemProcessor<PersonDto, Person> {

    @Override
    public Person process(PersonDto personDto) throws Exception {
        log.info("processing personDto={}", personDto);
        return Person.builder()
                .name(personDto.getFirstName().concat(" ").concat(personDto.getLastName()))
                .age(personDto.getAge())
                .build();
    }
}
