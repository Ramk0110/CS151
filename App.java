package dada;

import dada.Controller;
import dada.Message;
import dada.Model;
import dada.View;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class App {
    public static void main(String[] args) {

        BlockingQueue<Message> queue = new LinkedBlockingQueue<>();

        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(queue, model, view);
    }
}


