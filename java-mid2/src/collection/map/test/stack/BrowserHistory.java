package collection.map.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    private Deque<String> browserHistroy = new ArrayDeque<>();
    private Deque<String> temp = new ArrayDeque<>();

    public void visitPage(String host) {
        browserHistroy.push(host);
        System.out.println("방문: " + host);
    }

    public String goBack() {
        temp.push(browserHistroy.pop());
        String currentPage = browserHistroy.peek();
        System.out.println("뒤로가기: " + currentPage);
        return currentPage;
    }
}
    /*
    private String currentPage = null;

    public void visitPage(String url) {
        if (currentPage != null) {
            history.push(currentPage);
        }
        currentPage = url;
        System.out.println("방문: " + url);
    }

    public String goBack() {
        if (!history.isEmpty()) {
            currentPage = history.pop();
            System.out.println("뒤로 가기: " + currentPage);
            return currentPage;
        }
        return null;
    }

     */
