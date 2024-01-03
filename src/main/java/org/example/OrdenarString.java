package org.example;

import java.util.List;

public class OrdenarString {

    public void ordernar(List<String> palavras) {

        //  Entrada: [“zebra”, “cálice”, "borboleta" ]
        //  Entrada: [“cálice”, “zebra”, "borboleta" ]
        //  Entrada: [“cálice”, “zebra”, "borboleta" ]


        for(int atual = 0; atual < palavras.size(); atual++){
            for(int proxima = atual + 1; proxima < palavras.size(); proxima++) {
                if(palavras.get(atual).compareTo(palavras.get(proxima)) > 0){
                    String aux = palavras.get(atual);
                    palavras.set(atual, palavras.get(proxima));
                    palavras.set(proxima, aux);
                }
            }
        }
    }
}
