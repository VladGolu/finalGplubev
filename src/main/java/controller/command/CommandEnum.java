package controller.command;

import controller.command.impl.GetCustomerCommand;
import controller.command.impl.GetCustomersCommand;
import controller.command.impl.RegisterCommand;

public enum CommandEnum {

    GET_CUSTOMERS_COMMAND(new GetCustomersCommand()),
    GET_CUSTOMER_COMMAND(new GetCustomerCommand()),
    GET_REGISTER_COMMAND(new RegisterCommand());

    final Command command;

    CommandEnum(Command command){
        this.command = command;
    }

    public Command getCommand(){
        return command;
    }
}
