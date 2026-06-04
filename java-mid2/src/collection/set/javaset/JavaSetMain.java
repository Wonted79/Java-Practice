package collection.set.javaset;

import java.util.*;

public class JavaSetMain {
    public static void main(String[] args) {
        run(new HashSet<>());
        run(new LinkedHashSet<>());
        run(new TreeSet<>());
    }

    private static void run(Set<String> set){
        long start = System.currentTimeMillis();
        System.out.println("set = "+ set.getClass());
        Random random = new Random();
        for (int i=0; i<10000000;i++){
            set.add(String.valueOf(random.nextInt()));
        }
/*
// 컬렉션 반복 출력
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {  //다음 데이터가 있는지 확인
            System.out.println(iterator.next() + " ");  //다음 데이터 반환
        }

 */
        long end = System.currentTimeMillis();
        System.out.println((end-start)+"ms");
        System.out.println();
    }
}
