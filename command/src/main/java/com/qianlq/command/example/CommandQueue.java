package com.qianlq.command.example;

import java.util.ArrayList;

/**
 * @author CoderQian
 * @date 2019/7/12 3:27 PM
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public class CommandQueue {

    private ArrayList<AbstractCommand> commands = new ArrayList<>();

    public void addCommand(AbstractCommand command) {
        commands.add(command);
    }

    public void removeCommand(AbstractCommand command) {
        commands.remove(command);
    }

    public void execute() {
        // 循环调用每一个命令对象的execute()方法
        for (Object command : commands) {
            ((AbstractCommand) command).execute();
        }
    }
}
