package commands;
import components.DukeException;
import components.Storage;
import components.TaskList;

/**
 * Represents a command to mark a task as done.
 */
public class MarkCommand implements Command {

  /** Executes command to mark a task as done.
   *
   * @param taskList TaskList object.
   * @param storage Storage object.
   * @param input String representation of user input.
   * @throws DukeException If user input is incoherent.
   */
  @Override
  public String execute(TaskList taskList, Storage storage, String input) throws DukeException {
    if (input.equals("mark")) {
      throw new DukeException("☹ OOPS!!! The description of a mark cannot be empty.");
    } else {
      int num = Integer.parseInt(input.substring(5));
      assert num >= 0;
      return taskList.setTaskStatus(num - 1, true);
    }
  }
}