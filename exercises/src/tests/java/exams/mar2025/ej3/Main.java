package exams.mar2025.ej3;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Planta> plantas = new TreeSet<>();

        plantas.add(new Planta("Sequioadendron giganteum", 100));
        plantas.add(new Planta("Eucalyptus regnans", 110));
        plantas.add(new Planta("Ceroxylon quindiuense", 70));

        System.out.println(plantas);
    }
}
