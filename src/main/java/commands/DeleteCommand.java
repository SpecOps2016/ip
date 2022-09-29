package commands;
import components.Deadline;
import components.DukeException;
import components.Storage;
import components.TaskList;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

/**
 * Represents a command to delete a task.
 */
public class DeleteCommand implements Command {

  /**
   * Executes command to delete a task.
   *
   * @param taskList TaskList object.
   * @param storage Storage object.
   * @param input String representation of user input.
   * @throws DukeException If user input is incoherent.
   */
  @Override
  public String execute(TaskList taskList, Storage storage, String input) throws DukeException {
    if (input.equals("delete")) {
      throw new DukeException(
          "☹ OOPS!!! The description of a delete cannot be empty.");
    } else {
      int removal = Integer.parseInt(input.substring(7));
      return taskList.remove(removal - 1);
    }
  }
}