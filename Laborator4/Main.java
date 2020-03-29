import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Resident r0 = new Resident("R0");
        Resident r1 = new Resident("R1");
        Resident r2 = new Resident("R2");
        Resident r3 = new Resident("R3");

        Hospital h0 = new Hospital("h0", 3);
        Hospital h1 = new Hospital("h1", 3);
        Hospital h2 = new Hospital("h2", 3);
        Hospital h3 = new Hospital("h3", 3);

        List<Resident> residentList = new ArrayList<>();
        residentList.add(r0);
        residentList.add(r1);
        residentList.add(r2);
        residentList.add(r3);

        Collections.sort(residentList, Comparator.comparing(Resident::getName));
        Map<Resident, List<Hospital>> resPrefMap = new HashMap<>();
        resPrefMap.put(r0, Arrays.asList(h0, h1, h2));
        resPrefMap.put(r1, Arrays.asList(h1, h2, h3));
        resPrefMap.put(r2, Arrays.asList(h1, h2));
        resPrefMap.put(r3, Arrays.asList(h0, h1));
        System.out.println("H0:");
        residentList.stream()
                .filter(res -> resPrefMap.get(res)
                        .contains(h0)).forEach(System.out::println);
        System.out.println("H1:");
        residentList.stream()
                .filter(res -> resPrefMap.get(res)
                        .contains(h1)).forEach(System.out::println);
        System.out.println("H2:");
        residentList.stream()
                .filter(res -> resPrefMap.get(res)
                        .contains(h2)).forEach(System.out::println);
        System.out.println("H3:");
        residentList.stream()
                .filter(res -> resPrefMap.get(res).contains(h3)).forEach(System.out::println);


        List<Hospital> target = Arrays.asList(h0, h2);
        List<Resident> result = residentList.stream()
                .filter(res -> resPrefMap.get(res).containsAll(target))
                .collect(Collectors.toList());
        System.out.println(result);
    }

}
