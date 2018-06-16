import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;

public class Main {

    public static void mostrarDados(ArrayList<String> array){
        for (int k=0;k< array.size();k++)

            System.out.println("Posição "+k+": "+array.get(k));

    }




    public static void main(String[] args) {
        System.out.println("Hello World");

        ArrayList<String> meuArrayLouco = new ArrayList();

        //Seu primeiro nome, cep, endereço, número, complemento,
        // bairro, cidade e estado, telefone

        meuArrayLouco.add("Rogerinho");
        meuArrayLouco.add("87190000");
        meuArrayLouco.add("Praça");
        meuArrayLouco.add("222");
        meuArrayLouco.add("Rua");
        meuArrayLouco.add("Casa");
        meuArrayLouco.add("Centro");
        meuArrayLouco.add("Cidade");
        meuArrayLouco.add("PR");
        meuArrayLouco.add("911");

        //alterando
        meuArrayLouco.set(0,"Rogerinho da Van");
        meuArrayLouco.remove(2);
        //Mostrando usando laço e método
        mostrarDados(meuArrayLouco);
        System.out.println();
        System.out.println("Numa linha só: \n"+meuArrayLouco);
        System.out.println();
        //Mostrando com .stream / iteração
        meuArrayLouco.stream().forEach((item)->{
            System.out.println(item);
        });

    }

}