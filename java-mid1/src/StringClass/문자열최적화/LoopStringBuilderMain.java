package StringClass.문자열최적화;

public class LoopStringBuilderMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        StringBuilder result = new StringBuilder();
        for(int i=0; i<100000;i++){
            result.append("Hello Java");
        }
        long endTime = System.currentTimeMillis();
        String str = result.toString();
        System.out.println("result = "+str);
        System.out.println("time = "+(endTime-startTime)+"ms");
    }
}
