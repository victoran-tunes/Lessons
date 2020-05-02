package victor.antunes.Informatica.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import victor.antunes.Informatica.Model.Itens;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class ShopController {


    @GetMapping("/shop")
    public Itens shop() {
        Itens shop = new Itens();

        shop.setName("Processador AMD Ryzen 5 1600");
        shop.setFeature("Cache 19MB, 3.2GHz (3.6GHz Max Turbo)");
        return shop;

    }

    @GetMapping("/itens")
    public ArrayList<Itens> itens (){
        Itens shop = new Itens();

        shop.setName("SSD Kingston A400");
        shop.setFeature("480GB, SATA, Leitura 500MB/s, Gravação 450MB/s - SA400S37/480G ");

        Itens shop2 = new Itens();

        shop2.setName("Memória Corsair Vengeance LPX");
        shop2.setFeature("8GB, 2400MHz, DDR4");

        Itens shop3 = new Itens();
        shop3.setName("Placa de Vídeo Gigabyte NVIDIA GeForce GTX 1660");
        shop3.setFeature("OC 6G, GDDR5");

        ArrayList<Itens> register = new ArrayList();
        register.add(shop);
        register.add(shop2);
        register.add(shop3);

        return register;
    }
}
