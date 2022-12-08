

import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) {

//        1. LinkedList тизменин биринчи элементин алуу үчүн Java программасын жазыңыз.
//        LinkedList<String> linkedList = new LinkedList<>();
//        linkedList.add("Khafiz");
//        linkedList.add("Adi");
//        linkedList.add("Aigerim");
//        linkedList.add("Ainazik");
//        linkedList.addFirst("Ali");
//        System.out.println(linkedList);

//        2. LinkedList тизменин акыркы элементин алуу үчүн Java программасын жазыңыз.
//        LinkedList<String> list = new LinkedList<>();
//        list.add("Davran");
//        list.add("Samira");
//        list.add("Argen");
//        list.add("Ilim");
//        list.addLast("Erjan");
//        System.out.println(list);
////        3. LinkedList тизмеде белгилүү бир элемент бар же жок экенин текшерүү үчүн Java программасын жаз.
//        LinkedList<String> list = new LinkedList<>();
//        list.add("Davran");
//        list.add("Samira");
//        list.add("Argen");
//        list.add("Ilim");
//        System.out.println(list.contains("Davran"));
//        4. LinkedList тизмени массивдердин тизмесине которуу үчүн Java программасын жазыңыз.
//        LinkedList<String> list = new LinkedList<>();
//        list.add("Temirlan");
//        list.add("Osmon");
//        list.add("Nazik");
//        list.add("Nuriza");
//        System.out.println("Original" + list);
//        LinkedList<String> list1 = new LinkedList<>(list);
//        for (String a : list1) {
//            System.out.println("Copy" + a);
//        }

//        5. Эки LinkedList тизмесин салыштыруу үчүн Java программасын жазыңыз.
//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        LinkedList<Integer> list1 = new LinkedList<>();
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        System.out.println(list.equals(list1));

//        6. LinkedList тизме бош же жок экенин текшерүү үчүн Java программасын жазыңыз.
//        LinkedList<String> list = new LinkedList<>();
//        list.add("Aa");
//        list.add("Aa");
//        list.add("Aa");
//        list.add("Aa");
//        System.out.println(list.isEmpty());
//        7. LinkedList тизмедеги элементти алмаштыруу үчүн Java программасын жазыңыз.
//        LinkedList<String> list = new LinkedList<>();
//        list.add("Davran");
//        list.add("Asylbek");
//        list.add("Eliza");
//        list.add("Altynbek");
//        list.set(2, "Khafiz");
//        System.out.println(list);

//        __________________________________________________________________________________________
//
//        Java Collection: HashSet Exercises [12 көнүгүү]
//
//        The Hash Set: [
//        new BankAccount("OPTIMA","41692222" "7000")
//        new BankAccount("KYRGYZSTAN","41691111" "5000")
//        new BankAccount("DEMIR","41693333" "9000")
//        new BankAccount("RSK","41694444" "100000")
//        HashSet<BankAccound> set = new HashSet<>(Arrays.asList(
//                new BankAccound("OPTIMA", "41691111", "7000"),
//                new BankAccound("KYRGYZSTAN", "41691111", "9000"),
//                new BankAccound("DEMIR", "41693333", "9000"),
//                new BankAccound("RSK", "41694444", "10000")
//        ));
//        System.out.println(set);
//        1. Көрсөтүлгөн элементти HashSet топтомунун аягына кошуу үчүн Java программасын жазыңыз.
//        set.add(new BankAccound("Doskredo", "27648291", "0310390301"));
//        System.out.println(set);

////        2. HashSet тизмедеги бардык элементтерди кайталоо үчүн Java программасын жазыңыз.
//        Set<String> hashSet = new HashSet<>();
//        hashSet.add("Davran");
//        hashSet.add("Aigerim");
//        hashSet.add("Ainazik");
//        hashSet.add("Ilim");
//        System.out.println(hashSet);
//        Iterator<String> iterator = hashSet.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
////        3. HashSet топтомундагы элементтердин санын алуу үчүн Java программасын жазыңыз.
//        Set<Character> set = new HashSet<>();
//        set.add('1');
//        set.add('2');
//        set.add('3');
//        set.add('4');
//        set.add('5');
//        set.add('6');
//        set.add('7');
//        set.add('8');
//        System.out.println("Original: "+set);
//        System.out.println("Size of the Hash Set: "+set.size());
//        4. HashSet топтомун бошотуу үчүн Java программасын жазыңыз.
        Set<String> set = new HashSet<>();
        set.add("Js");
        set.add("Java");
        set.add("Python");
        set.add("JavaScript");
        set.add("c++");
        System.out.println("Polniy: " + set);
        set.clear();
        System.out.println("Pustoy: " + set);
//        5. HashSet топтомунун бош же жок экенин текшерүү үчүн Java программасын жазыңыз.
//        Set<String> set = new HashSet<>();
//        set.add("Bishkek");
//        set.add("Naryn");
//        set.add("Batken");
//        System.out.println("isEmpty: " + set.isEmpty());
//        6. HashSet топтомун башка хэш топтомуна клондоо үчүн Java программасын жазыңыз.
//        Set<String> set = new HashSet<>();
//        set.add("Apple");
//        set.add("HTC");
//        set.add("Huawei");
//        set.add("POCO");
//        System.out.println("Original" + set);
//        HashSet<String> hashSet1 = new HashSet<>(set);
//        System.out.println("Cloned: " + hashSet1.clone());
//        7. HashSet топтомун массивге айландыруу үчүн Java программасын жазыңыз.
//        Set<String> set = new HashSet<>();
//        set.add("basketball");
//        set.add("football");
//        set.add("volleyball");
//        set.add("hockey");
//        set.add("swimming");
//        System.out.println("Original: " + set);
//        String[] newArray = new String[set.size()];
//        set.toArray(newArray);
//        System.out.println("Array: ");
//        for (String element : newArray) {
//            System.out.println(element);
//        }
//        8. HashSet топтомун трисет топтомуна айландыруу үчүн Java программасын жазыңыз.
//        Set<String> set = new HashSet<>();
//        set.add("Naryn");
//        set.add("Issyk-Kul");
//        set.add("Batken");
//        set.add("Osh");
//        System.out.println("HashSet: "+set);
//        Set<String> hashSetToTreeSet = new TreeSet<>(set);
//        System.out.println("TreeSet: " +hashSetToTreeSet);
//        9. HshSet топтомун List/ ArrayListке айландыруу үчүн Java программасын жазыңыз.
//        Set<String> set = new HashSet<>();
//        set.add("Audi");
//        set.add("BMW");
//        set.add("Ford");
//        set.add("Mercedes-Benz");
//        System.out.println("Original: " + set);
//        ArrayList<String> list = new ArrayList<>(set);
//        System.out.println("ArrayList Contains: " + list);
//        10. Эки HashSet топтомун салыштыруу үчүн Java программасын жазыңыз.
//        Set<String> set1 = new HashSet<>();
//        set1.add("Asus");
//        set1.add("Lenovo");
//        set1.add("MacBook");
//        set1.add("Acer");
//
//        Set<String> set2 = new HashSet<>();
//        set2.add("Asus");
//        set2.add("Lenovo");
//        set2.add("MacBook");
//        set2.add("Acer");
//        HashSet<String> result = new HashSet<>();
//        for (String element : set1) {
//            System.out.println(set2.contains(element));
//        }
//        11. Эки топтомду салыштыруу жана эки топтомдо бирдей элементтерди сактоо үчүн Java программасын жазыңыз.
//        HashSet<String> set1 = new HashSet<>();
//        set1.add("Davran");
//        set1.add("Azamat");
//        set1.add("Aisulu");
//        set1.add("Joodar");
//        System.out.println(set1);
//
//        HashSet<String> set2 = new HashSet<>();
//        set2.add("Khafiz");
//        set2.add("Abu-Ali");
//        set2.add("Ainazik");
//        set2.add("Arnas");
//        System.out.println(set2);
//
//        set1.retainAll(set2);
//        System.out.println("HashSet content:");
//        System.out.println(set1);

//        12. HashSet топтомунан бардык элементтерди алып салуу үчүн Java программасын жазыңыз.
//        HashSet<String> set = new HashSet<>();
//        set.add("Altynbek");
//        set.add("Aigerim");
//        set.add("Eliza");
//        set.add("Nuriza");
//        System.out.println(set);
//        _____________________________________________________________________________________________
//
//        Java Collection: TreeSet Exercises [16 көнүгүүлөр]
//
//        1. Жаңы TreeSet топтомун түзүү үчүн Java программасын жазыңыз, бир нече түстөрдү  кошуп, TreeSet топтомун басып чыгарыңыз.
//        Set<String> set = new TreeSet<>();
//        set.add("Davran");
//        set.add("Alia");
//        set.add("Nurik");
//        System.out.println(set);
//        2. TreeSet топтомундагы бардык элементтерди кайталоо үчүн Java программасын жазыңыз.
//        TreeSet<String> treeSet = new TreeSet<>();
//        treeSet.add("Nagima");
//        treeSet.add("Kauhar");
//        treeSet.add("Akylai");
//        treeSet.add("Temirlan");
//        for (String element : treeSet) {
//            System.out.println(element);
//        }
//        3. Белгиленген TreeSet топтомунун бардык элементтерин башка TreeSet топтомуна кошуу үчүн Java программасын жазыңыз.
//        HashSet<String> integers = new HashSet<>();
//        HashSet<String> integers1 = new HashSet<>();
//        integers.add("Davran");
//        integers.add("Diliy");
//        integers.add("Aisulu");
//        integers1.add("Nurjigit");
//        integers1.add("Kaliy");
//        integers1.add("Saltanat");
//
//        System.out.println("TreeSed: " + integers + " " + integers1);
//        System.out.println(integers.addAll(integers1));
//
//        4. Берилген TreeSet топтомундагы элементтердин тескери иреттүү көрүнүшүн түзүү үчүн Java программасын жазыңыз.
//        TreeSet<String> set = new TreeSet<>();
//        set.add("Batken");
//        set.add("Naryn");
//        set.add("Issyk-Kul");
//        System.out.println("Contains: " + set);
//        System.out.println();
//        TreeSet<String> res = (TreeSet<String>) set.descendingSet();
//        System.out.println(res);
//        5. TreeSet топтомундагы биринчи жана акыркы элементтерди алуу үчүн Java программасын жазыңыз.
//        TreeSet<Integer> treeSet = new TreeSet<>();
//        treeSet.add(1);
//        treeSet.add(43);
//        treeSet.add(245);
//        treeSet.add(446);
//        treeSet.add(4434);
//        System.out.println("TreeSet: ");
//        System.out.println(treeSet);
//
//        Object first_element = treeSet.first();
//        System.out.println("First Element is: " + first_element);
//
//        Object last_element = treeSet.last();
//        System.out.println("Last Element is: " + last_element);
//        6. TreeSet тизмегин башка TreeSet топтомуна клондоо(clone) үчүн Java программасын жазыңыз.
//        TreeSet<Integer> set = new TreeSet<>();
//        set.add(24);
//        set.add(224);
//        set.add(45);
//        set.add(13);
//
//        System.out.println("Original:" + set);
//        TreeSet<String> new_t_set = (TreeSet<String>) set.clone();
//        System.out.println("Cloned: " + set);
//        7. TreeSet топтомундагы элементтердин санын алуу үчүн Java программасын жазыңыз.
//        TreeSet<String> t_set = new TreeSet<>();
//        t_set.add("Davran");
//        t_set.add("Janeta");
//        t_set.add("Kanikey");
//        t_set.add("Altynbek");
//        System.out.println("Original: " + t_set);
//        System.out.println("Size: " + t_set.size());
//        8. Эки TreeSet топтомун салыштыруу үчүн Java программасын жаз.
//        TreeSet<String> set = new TreeSet<>();
//        set.add("Moon");
//        set.add("Star");
//        set.add("Sky");
//        set.add("Cloud");
//        System.out.println("First HashSet content: "+set);
//
//        TreeSet<String> set1 = new TreeSet<>();
//        set1.add("Moon");
//        set1.add("Star");
//        set1.add("Sky");
//        set1.add("Cloud");
//        set1.add("Railroad");
//        System.out.println("First HashSet content: "+set1);
//        9. Tree топтомундагы 7ден аз сандарды табуу үчүн Java программасын жаз.
//        TreeSet <Integer>tree_num = new TreeSet<>();
//        TreeSet <Integer>treeheadset = new TreeSet<>();
//        tree_num.add(1);
//        tree_num.add(2);
//        tree_num.add(3);
//        tree_num.add(5);
//        tree_num.add(6);
//        tree_num.add(7);
//        tree_num.add(8);
//        tree_num.add(9);
//        tree_num.add(10);
//        treeheadset = (TreeSet)tree_num.headSet(7);
//
//        Iterator iterator;
//        iterator = treeheadset.iterator();
//
//        System.out.println("Tree set data: ");
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next() + " ");
//        }
//        10. Берилген элементтен чоң же ага барабар болгон TreeSet жыйындысынын элементин алуу үчүн Java программасын жазыңыз.
//        TreeSet <Integer>tree = new TreeSet<>();
//        tree.add(10);
//        tree.add(22);
//        tree.add(36);
//        tree.add(25);
//        tree.add(16);
//        tree.add(70);
//        tree.add(82);
//        tree.add(89);
//        tree.add(14);
//
//        System.out.println("Greater than or equal to : "+tree.ceiling(22));
//        System.out.println("Greater than or equal to  : "+tree.ceiling(10));
//        11. Берилген элементтен кичине же ага барабар болгон TreeSet топтомундагы элементти алуу үчүн Java программасын жазыңыз.
//        TreeSet<Integer> sim = new TreeSet<>();
//        sim.add(23);
//        sim.add(12);
//        sim.add(34);
//        sim.add(67);
//        sim.add(3);
//        System.out.println(sim);
//        System.out.println("Less than or equal to: "+sim.ceiling(25));
//        System.out.println("Less than or equal to: "+sim.ceiling(34));
//        12. TreeSet топтомунун биринчи элементин алуу жана алып салуу үчүн Java программасын жазыңыз.
//        TreeSet<Integer> tree_num = new TreeSet<>();
//        tree_num.add(10);
//        tree_num.add(22);
//        tree_num.add(36);
//        tree_num.add(25);
//        tree_num.add(16);
//        tree_num.add(70);
//        tree_num.add(82);
//        tree_num.add(89);
//        tree_num.add(14);
//        System.out.println("Original tree set: " + tree_num);
//        System.out.println("Removes the first(lowest) element: " + tree_num.pollFirst());
//        13. TreeSet топтомунун акыркы элементин алуу жана алып салуу үчүн Java программасын жазыңыз.
//        TreeSet<String> ts = new TreeSet<>();
//        ts.add("Mathematics");
//        ts.add("geography");
//        ts.add("history");
//        ts.add("biology");
//        ts.add("geometry");
//        System.out.println(ts);
//        System.out.println("The last element of the TreeSet: " + ts.pollLast());
//        14. Берилген элементти TreeSet жыйындысынан алып салуу үчүн Java программасын жазыңыз.
//        (отредактировано)
        TreeSet<String> body = new TreeSet<>();
        body.add("eye");
        body.add("head");
        body.add("stomach");
        body.add("hand");
        body.add("heart");
        body.add("foot");

        TreeSet<Integer> integers = new TreeSet<>();
        integers.add(4);
        integers.add(6);
        integers.add(7);
        integers.add(8);
        integers.add(10);

        body.remove("eye");

        System.out.println("Original tree set: " + body);
        System.out.println("Remove the given element from the TreeSet: " + body.ceiling("eye"));


    }
}
