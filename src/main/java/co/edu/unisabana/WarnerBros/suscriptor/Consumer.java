package co.edu.unisabana.WarnerBros.suscriptor;


import co.edu.unisabana.streamings.controller.movie;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Consumer {

    @RabbitListener(queues = {"unisabana.peliculas.notificar"})
    public void receive(@Payload movie movies) {
        log.info("Escuche de la cola unisabana.peliculas.notificar {}", movies.getNombrePelicula());
    }
}