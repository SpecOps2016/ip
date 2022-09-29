package commands;
import components.DukeException;
import components.Storage;
import components.TaskList;

/**
 * Represents a command to find a task.
 */
public class FindCommand implements Command {

  /** Executes command to find a task.
   *
   * @param taskList TaskList object.
   * @param storage Storage object.
   * @param input String representation of user input.
   * @throws DukeException If user input is incoherent.
   */
  @Override
  public String execute(TaskList taskList, Storage storage, String input) throws DukeException {
    return taskList.findLine(input.substring(5));
  }
}