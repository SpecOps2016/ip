package commands;
import components.DukeException;
import components.Storage;
import components.TaskList;

/**
 * Represents a command to list tasks.
 */
public class ListCommand implements Command {

  /** Executes command to list tasks.
   *
   * @param taskList TaskList object.
   * @param storage Storage object.
   * @param line String representation of user input.
   * @throws DukeException If user input is incoherent.
   */
  @Override
  public String execute(TaskList taskList, Storage storage, String line) throws DukeException {
    return taskList.showTasks();
  }
}
