package designpatterns.command;

import java.util.ArrayList;
import java.util.List;

public class MacroCommand extends Command {

  private List<Command> commands;
  
  public MacroCommand() {
    commands = new ArrayList<>();
  }
  
  public void add(Command command) {
    this.commands.add(command);
  }
  
  public void remove(Command command) {
    this.commands.remove(command);
  }
  
  @Override
  public void execute() {
    for(Command each : commands) {
      each.execute();
    }
  }

}
