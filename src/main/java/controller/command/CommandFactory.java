package controller.command;

import javax.servlet.http.HttpServletRequest;

public class CommandFactory {

    private CommandFactory() {
    }

    public static Command createCommand(HttpServletRequest request) {
        String commandParameter = request.getParameter("command");
        return  CommandEnum.valueOf(commandParameter).getCommand();
    }
}
