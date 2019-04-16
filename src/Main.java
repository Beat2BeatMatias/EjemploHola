import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main{

    public static void main(String[] args) {
    int a=10,b=20,c=-5;

        sumar(a,b,c);
        ICalculadora iSuma=(d,e)->d+e;
        System.out.println("5+4 = "+iSuma.operacion(5,4));
        ICalculadora iResta=(d,e)->d-e;
        System.out.println("5+4 = "+iSuma.operacion(5,4));

        List<Integrante> lista=new ArrayList<>();

        lista.add(new Integrante(1, "Agustin", "Crosetto", "agustin.crosetto@mercadolibre.com"));
        lista.add(new Integrante(2, "Vera", "Cristian", "cristian.vera@mercadolibre.com"));
        lista.add(new Integrante(3, "Joel", "Nievas Arroyo", "joel.nievas@mercadolibre.com"));
        lista.add(new Integrante(5, "Facundo", "Parra", "facundo.parra@mercadolibre.com"));
        lista.add(new Integrante(4, "Federico Santiago", "Torres", "federicosantiago.torres@mercadolibre.com"));
        lista.add(new Integrante(1, "Agustin", "Crosetto", "agustin.crosetto@mercadolibre.com"));
        lista.add(new Integrante(6, "Matias", "Torreblanca", "matias.torreblanca@mercadolibre.com"));
        lista.add(new Integrante(7, "Rodrigo", "Vicente", "rodrigo.vicente@mercadolibre.com"));
        lista.add(new Integrante(8, "Matias", "Krenz", "matias.krenz@mercadolibre.com"));
        lista.add(new Integrante(9, "Guillermo", "Cook", "guillermo.cook@mercadolibre.com"));
        lista.add(new Integrante(10, "Guido", "Michelini", "guido.michelini@mercadolibre.com"));
        lista.add(new Integrante(11, "Pedro", "Esequiel Tarazi", "pedro.tarazi@mercadolibre.com"));
        lista.add(new Integrante(12, "Diego", "Rodrigo Garbiglia", "diego.garbiglia@mercadolibre.com"));
        lista.add(new Integrante(13, "Mariana", "Morelli", "mariana.morelli@mercadolibre.com"));
        lista.add(new Integrante(14, "Mauricio", "Clerici", "mauricio.clerici@mercadolibre.com"));
        lista.add(new Integrante(16, "Marco", "Martinelli", "marco.martinelli@mercadolibre.com"));
        lista.add(new Integrante(17, "Franco", "Nahuel Capurro", "franco.capurro@mercadolibre.com"));
        lista.add(new Integrante(18, "Marcos", "Exequiel Lopez", "marcos.lopez@mercadolibre.com"));
        lista.add(new Integrante(15, "Marco", "Martinez", "marco.martinezmolina@mercadolibre.com"));
        lista.add(new Integrante(19, "Matías", "Farías Falkiewicz", "matias.fariasfalkiewicz@mercadolibre.com"));
        lista.add(new Integrante(20, "Mauricio", "Parra Casado", "mauricio.parra@mercadolibre.com"));
        lista.add(new Integrante(21, "Juan", "Manuel Beresiarte", "juan.beresiarte@mercadolibre.com"));
        lista.add(new Integrante(22, "Matias", "Brond", "matias.brond@mercadolibre.com"));
        lista.add(new Integrante(23, "César", "Pablo Morichetti", "cesar.morichetti@mercadolibre.com"));
        lista.add(new Integrante(24, "Rodrigo", "Guillermo Luna", "rodrigo.luna@mercadolibre.com"));
        lista.add(new Integrante(25, "Juan", "Manuel Sardoy", "juan.sardoy@mercadolibre.com"));
        lista.add(new Integrante(26, "Valentín", "Reviglio", "valentin.reviglio@mercadolibre.com"));
        lista.add(new Integrante(27, "Federico", "Salas", "federico.salas@mercadolibre.com"));
        lista.add(new Integrante(28, "Gastón", "Barbero", "rodrigo.barbero@mercadolibre.com"));
        lista.add(new Integrante(29, "Gaston Martin", "Jofre", "gaston.jofre@mercadolibre.com"));
        lista.add(new Integrante(30, "Federico", "Silva", "federico.fsilva@mercadolibre.com"));
        lista.add(new Integrante(31, "Juan", "Ignacio Filardo", "juan.filardo@mercadolibre.com"));
        lista.add(new Integrante(32, "Rodrigo", "Andres Crespillo", "rodrigo.crespillo@mercadolibre.com"));
        lista.add(new Integrante(33, "Mario", "Ezequiel Ferreyra", "mario.ferreyra@mercadolibre.com"));
        lista.add(new Integrante(34, "Julian", "De Angelis", "alanjulian.deangelis@mercadolibre.com"));
        lista.add(new Integrante(35, "Leandro", "Etcharren", "leandro.etcharren@mercadolibre.com"));
        lista.add(new Integrante(36, "Bustos", "Figueroa María Cecilia", "cecilia.bustosfigueroa@mercadolibre.com"));

        Stream<Integrante> listaIntegrantes=lista.stream();

        //Ejercicio 1
//        listaIntegrantes.forEach(System.out::println);
        //Ejercicio 2
//        listaIntegrantes.filter(s -> s.getApellido().startsWith("L") || s.getApellido().startsWith("M"))
//                        .forEach(System.out::println);
        //Ejercicio 3
//          listaIntegrantes.map(s->s.getCorreo().replaceAll("@mercadolibre.com",""))
//                          .filter(s -> (s.length()>15)).forEach(System.out::println);
        //Ejercicio 4
        //listaIntegrantes.limit(2).forEach(System.out::println);
        //Ejercicio5
        //listaIntegrantes.filter(s->s.getId()==(int)(36/2)).forEach(System.out::println);
        //Ejercicio 6
        listaIntegrantes.filter(s->s.getApellido().toLowerCase().contains("m")).forEach(System.out::println);



    }
    public static void sumar(int a,int b, int c){
        int total=a+b+c;
        System.out.println("Total: " + total);
    }
}
