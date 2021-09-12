package br.com.carolina.tp3;

import br.com.carolina.tp3.model.domain.Literatura;
import br.com.carolina.tp3.model.service.CientificoService;
import br.com.carolina.tp3.model.service.LiteraturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class LivroLoader implements ApplicationRunner {

    @Autowired
    private LiteraturaService literaturaService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Literatura literatura1 = new Literatura();
        literatura1.setTitulo("A longa viagem a um pequeno planeta hostil");
        literatura1.setGenero("Ficção científica");
        literatura1.setAutor("Becky Chambers");
        literatura1.setIdioma("Português");
        literatura1.setUsado(true);

        literaturaService.incluir(literatura1);

        Literatura literatura2 = new Literatura();
        literatura2.setTitulo("Dom Casmurro");
        literatura2.setGenero("Romance");
        literatura2.setAutor("Machado de Assis");
        literatura2.setIdioma("Português");
        literatura2.setUsado(true);

        literaturaService.incluir(literatura2);

        for (Literatura l : literaturaService.obterLista()) {
            System.out.println(l);
        }

        literaturaService.excluir(1);

        for(Literatura l : literaturaService.obterLista()) {
            System.out.println(l);
        }

        Literatura literatura3 = literaturaService.obterPorId(2);
        System.out.println(literatura3.getTitulo());
    }
}
