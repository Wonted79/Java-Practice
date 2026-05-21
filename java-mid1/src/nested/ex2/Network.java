package nested.ex2;

import nested.ex1.NetworkMessage;

//중첩클래스는 NetworkMessage 클래스가 Network 안에서만 쓰인다는것을 나타내기 위한것
public class Network {

    public void sendMessage(String text){
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }


    public static class NetworkMessage {
        private String content;

        public NetworkMessage(String content){
            this.content = content;
        }

        public void print() {
            System.out.println(content);
        }
    }
}