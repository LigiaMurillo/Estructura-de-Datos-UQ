package co.edu.uniquindio;

import co.edu.uniquindio.arbol.ArbolBinario;
import co.edu.uniquindio.arbol.ArbolBinarioNoGenerico;
import co.edu.uniquindio.arbol.Nodo;
import co.edu.uniquindio.arbol.NodoNoGenerico;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String[] himno = himno()
                .replace(",", "")
                .replace(".", "")
                .replace("\n", " ")
                .split(" ");

        /*ArbolBinario<Map.Entry<String, Integer>> arbol = new ArbolBinario<>();

        for (String palabra: himno) {
            Nodo<Map.Entry<String, Integer>> nodo = arbol.buscar(new AbstractMap.SimpleEntry<String, Integer>(palabra, 0));
            if (nodo != null) {
                nodo.getT().setValue(nodo.getT().getValue() + 1);
            }
            else {
                arbol.insertar(new AbstractMap.SimpleEntry<String, Integer>(palabra, 1));
            }
        }

        System.out.println(arbol);*/

       /* ArbolBinarioNoGenerico arbol = new ArbolBinarioNoGenerico();
        for (String palabra: himno) {
            NodoNoGenerico nodo = arbol.buscar(palabra);
            if (nodo != null) {
                nodo.setValue(nodo.getValue() + 1);
            }
            else {
                arbol.insertar(palabra, 1);
            }
        }

        System.out.println(arbol);*/

       /* ArbolBinario<String> i = new ArbolBinario();
        i.insertar("M");
        i.insertar("Y");
        i.insertar("T");
        i.insertar("E");
        i.insertar("R");

        System.out.println("Preorden: " + i.obtenerPreorden());
        System.out.println("Orden: " + i.obtenerOrden());
        System.out.println("Postorden: " + i.obtenerPostorden());

        ArbolBinario<String> ii = new ArbolBinario();
        ii.insertar("T");
        ii.insertar("Y");
        ii.insertar("M");
        ii.insertar("E");
        ii.insertar("R");

        System.out.println("Arbol ii");

        System.out.println("Preorden: " + ii.obtenerPreorden());
        System.out.println("Orden: " + ii.obtenerOrden());
        System.out.println("Postorden: " + ii.obtenerPostorden());

        ArbolBinario<String> iii = new ArbolBinario();
        iii.insertar("R");
        iii.insertar("E");
        iii.insertar("M");
        iii.insertar("Y");
        iii.insertar("T");

        System.out.println("Arbol iii");

        System.out.println("Preorden: " + iii.obtenerPreorden());
        System.out.println("Orden: " + iii.obtenerOrden());
        System.out.println("Postorden: " + iii.obtenerPostorden());*/

        ArbolBinario<String> iv = new ArbolBinario();
        iv.insertar("LIGIA ");
        iv.insertar("MERCURIO ");
        iv.insertar("VENUS ");
        iv.insertar("TIERRA ");
        iv.insertar("MARTE ");
        iv.insertar("CERES ");
        iv.insertar("JUPITER ");
        iv.insertar("SATURNO ");
        iv.insertar("URANO ");
        iv.insertar("NEPTUNO ");
        iv.insertar("PLUTON ");
        iv.insertar("HAUMEA ");
        iv.insertar("MAKEMAKE ");
        iv.insertar("ERIS ");
        iv.insertar("SEDNA ");
        iv.insertar("PHATTIE ");

        System.out.println("Arbol iv");

        System.out.println("Preorden: " + iv.obtenerPreorden());
        System.out.println("Orden: " + iv.obtenerOrden());
        System.out.println("Postorden: " + iv.obtenerPostorden());

        System.out.println(iv.esEquilibrado());


        /*arbol.insertar(40);
        arbol.insertar(20);
        arbol.insertar(55);
        arbol.insertar(50);
        arbol.insertar(10);
        arbol.insertar(30);
        arbol.insertar(70);
        arbol.insertar(45);
        arbol.insertar(54);

        System.out.println(arbol);
        arbol.eliminar(54);
        System.out.println(arbol);*/
//        System.out.println(arbol.buscar("D").getT());
//        System.out.println(arbol.buscar("*").getT());

//        Nodo<String> nodo = arbol.agregarNuevoArbol("A", null, null);
//        arbol.setRaiz(nodo);

        /*arbol.setRaiz(new Nodo<>("A"));

        Nodo<String> a = arbol.getRaiz();

        Nodo<String> b =new Nodo<>("B");
        a.setIzquierda(b);
        b.setIzquierda(new Nodo<>("D"));
        b.setDerecha(new Nodo<>("E"));

        Nodo<String> c =new Nodo<>("C");
        a.setDerecha(c);

        Nodo<String> f =new Nodo<>("F");
        c.setIzquierda(f);
        f.setIzquierda(new Nodo<>("H"));
        c.setDerecha(new Nodo<>("G"));

        System.out.println(arbol.getAltura());
        System.out.println(arbol.esEquilibrado());
        System.out.println(arbol.esPerfectamenteEquilibrado());

        System.out.println(arbol.obtenerPreorden());
        System.out.println(arbol.obtenerOrden());
        System.out.println(arbol.obtenerPostorden());*/
    }

    private static String himno () {
        String texto = "Oh gloria inmarcesible \n" +
                "Oh j??bilo inmortal \n" +
                "En surcos de dolores \n" +
                "El bien germina ya. \n" +
                "\n" +
                "Ces?? la horrible noche \n" +
                "La libertad sublime \n" +
                "Derrama las auroras \n" +
                "De su invencible luz. \n" +
                "La humanidad entera, \n" +
                "Que entre cadenas gime, \n" +
                "Comprende las palabras \n" +
                "Del que muri?? en la cruz \n" +
                "\n" +
                "\"Independencia\" grita \n" +
                "El mundo americano: \n" +
                "Se ba??a en sangre de h??roes \n" +
                "La tierra de Col??n. \n" +
                "Pero este gran principio: \"el rey no es soberano\" \n" +
                "Resuena, Y los que sufren \n" +
                "Bendicen su pasi??n. \n" +
                "\n" +
                "Del Orinoco el cauce \n" +
                "Se colma de despojos, \n" +
                "De sangre y llanto un r??o Se mira all?? correr. \n" +
                "En B??rbula no saben \n" +
                "Las almas ni los ojos \n" +
                "Si admiraci??n o espanto \n" +
                "Sentir o padecer. \n" +
                "\n" +
                "A orillas del Caribe \n" +
                "Hambriento un pueblo lucha Horrores prefiriendo \n" +
                "A p??rfida salud. \n" +
                "Oh s?? de Cartagena \n" +
                "La abnegaci??n es mucha, \n" +
                "Y escombros de la muerte \n" +
                "desprecian su virtud. \n" +
                "\n" +
                "De Boyac?? en los campos \n" +
                "El genio de la gloria \n" +
                "Con cada espiga un h??roe \n" +
                "invicto coron??. \n" +
                "Soldados sin coraza \n" +
                "Ganaron la victoria; \n" +
                "Su varonil aliento \n" +
                "De escudo les sirvi??. \n" +
                "\n" +
                "Bol??var cruza el Ande \n" +
                "Que riega dos oc??anos \n" +
                "Espadas cual centellas \n" +
                "Fulguran en Jun??n. \n" +
                "Centauros indomables \n" +
                "Descienden a los llanos \n" +
                "Y empieza a presentirse \n" +
                "De la epopeya el fin. \n" +
                "\n" +
                "La trompa victoriosa \n" +
                "Que en Ayacucho truena \n" +
                "En cada triunfo crece \n" +
                "Su formidable s??n. \n" +
                "En su expansivo empuje \n" +
                "La libertad se estrena, \n" +
                "Del cielo Americano \n" +
                "Formando un pabell??n. \n" +
                "\n" +
                "La Virgen sus cabellos \n" +
                "Arranca en agon??a \n" +
                "Y de su amor viuda \n" +
                "Los cuelga del cipr??s. \n" +
                "Lamenta su esperanza \n" +
                "Que cubre losa fr??a; \n" +
                "Pero glorioso orgullo \n" +
                "circunda su alba tez. \n" +
                "\n" +
                "La Patria as?? se forma \n" +
                "Term??pilas brotando; \n" +
                "Constelaci??n de c??clopes Su noche ilumin??; \n" +
                "La flor estremecida \n" +
                "Mortal el viento hallando \n" +
                "Debajo los laureles\n" +
                "Seguridad busc?? \n" +
                "\n" +
                "Mas no es completa gloria Vencer en la batalla, \n" +
                "Que al brazo que combate Lo anima la verdad. \n" +
                "La independencia sola \n" +
                "El gran clamor no acalla: \n" +
                "Si el sol alumbra a todos \n" +
                "Justicia es libertad. \n" +
                "\n" +
                "Del hombre los derechos \n" +
                "Nari??o predicando, \n" +
                "El alma de la lucha \n" +
                "Prof??tico ense????. \n" +
                "Ricaurte en San Mateo \n" +
                "En ??tomos volando \n" +
                "\"Deber antes que vida\", \n" +
                "Con llamas escribi??. ";
        return texto;
    }
}
