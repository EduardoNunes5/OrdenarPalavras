import org.example.OrdenarString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class OrdernarStringTest {


    private OrdenarString ordenarString;



    @BeforeEach
    void setup(){
        ordenarString = new OrdenarString();
    }

    /*
    Entrada: [“zebra”, “cálice”, "borboleta" ]
    Saída:  ["borboleta", “cálice”, “zebra”]
     */
    @Test
    void test(){
        List<String> input = new ArrayList<>(List.of("zebra", "zebra", "cálice", "borboleta", "zebra", "walter", "walter", "borboleta"));
        List<String> output = List.of("borboleta", "borboleta", "cálice", "walter", "walter", "zebra", "zebra", "zebra");
        ordenarString.ordernar(input);
        Assertions.assertEquals(output, input);
    }

    @Test
    void test2(){
        List<String> input = new ArrayList<>(List.of("cenoura", "arvore", "bola", "abacate"));
        List<String> output = List.of("abacate", "arvore", "bola", "cenoura");

        ordenarString.ordernar(input);
        Assertions.assertEquals(output, input);
    }
}
