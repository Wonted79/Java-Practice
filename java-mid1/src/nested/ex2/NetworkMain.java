package nested.ex2;

import nested.ex1.Network;

public class NetworkMain {
    public static void main(String[] args) {
        Network network = new Network();
        network.sendMessage("hello java");
    }
}
