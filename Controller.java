package dada;

import dada.ResetMessage;
import dada.Message;
import dada.UpdateMessage;
import dada.Model;
import dada.View;

import java.util.concurrent.BlockingQueue;

public class Controller {
    BlockingQueue<Message> queue;
    Model studentModel;
    View view;

    public Controller(BlockingQueue<Message> queue, Model studentModel, View view) {
        this.queue = queue;
        this.studentModel = studentModel;
        this.view = view;
    }
}

